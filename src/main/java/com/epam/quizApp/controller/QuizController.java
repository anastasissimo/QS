package com.epam.quizApp.controller;

import com.epam.quizApp.model.Question;
import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.User;
import com.epam.quizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QuizController {

    private QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/single-quiz")
    public String ImTestingSingleQuiz(Model model,
                                      @RequestParam Integer id){

        if (User.utilUser != null){

            Quiz quiz = quizService.getById(id);

            System.out.println("Name of quiz: " + quiz.getTitle());
            List<Question> questionList = quiz.getQuestions();

            System.out.println("List size: " + questionList.size());

            model.addAttribute("quizName", quiz.getTitle());
            model.addAttribute("questionList", questionList);

            return "single-quiz";
        }else {
            return "redirect:/";
        }
    }

}
