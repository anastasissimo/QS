package com.epam.quizApp.controller;


import com.epam.quizApp.model.User;
import com.epam.quizApp.service.UserService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class AdminController {
    private UserService userService;

    @GetMapping("/admin")
    public String ImDoingStuff(Model model){

        if (User.utilUser != null){

            List<User> users = userService.getTeacherRequests();
            model.addAttribute("userList", users);
            return "admin";
        }else {
            return "redirect:/";
        }
    }

}
