package com.epam.quizApp.controller;

import com.epam.quizApp.model.Question;
import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.User;
import com.epam.quizApp.service.QuizService;
import com.epam.quizApp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class TeacherController {
    private UserService userService;
    private QuizService quizService;

    @GetMapping("/teacher")
    public String ImTestingQuiz(Model model,
                                      @RequestParam Integer id){

        if (User.utilUser != null){
            Quiz quiz = quizService.getById(id);
            System.out.println("Name of quiz: " + quiz.getTitle());
            List<Question> questionList = quiz.getQuestions();
            System.out.println("List size: " + questionList.size());
            model.addAttribute("quizName", quiz.getTitle());
            model.addAttribute("questionList", questionList);

            return "teacher";
        }else {
            return "redirect:/";
        }
    }

    @RequestMapping("/add-test")
    public String AddingTest(){
        return "add-test";
    }
}
