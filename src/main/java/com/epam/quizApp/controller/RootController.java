package com.epam.quizApp.controller;

import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.User;
import com.epam.quizApp.service.QuizService;
import com.epam.quizApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RootController {

    private UserService userService;
    private QuizService quizService;

    @Autowired
    public RootController(UserService userService, QuizService quizService) {
        this.userService = userService;
        this.quizService = quizService;
    }

    @GetMapping("/")
    public String root(){
        return "login";
    }

    @PostMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/login")
    public String loginpls(){
        return "login";
    }


    @PostMapping("/user")
    public String ImTestingListOfQuizzes(Model model,
                                         @RequestParam(required = true, defaultValue = "") String login,
                                         @RequestParam(required = true, defaultValue = "") String password) {

        User currentUser = userService.getByMail(login);

        if (currentUser != null && currentUser.getPassword().equals(password)) {
            switch (currentUser.getRole()) {
                case TEACHER:
                    User.utilUser = currentUser;
                    List<Quiz> quizList = quizService.getByUser(currentUser);
                    model.addAttribute("quizList", quizList);
                    return "teacher";
                case STUDENT:
                    User.utilUser = currentUser;
                    List<Quiz> quizListStudent = quizService.getByTopic("sas");

                    model.addAttribute("quizListStudent", quizListStudent);
                    return "student";
                case ADMIN:
                    User.utilUser = currentUser;
                    List<User> userList = userService.getTeacherRequests();
                    model.addAttribute("userList", userList);
                    return "admin";
            }
        } else return "login";
    return "login";
    }

    @RequestMapping("/register")
    public String SignUp(){
        return "registration";
    }

}
