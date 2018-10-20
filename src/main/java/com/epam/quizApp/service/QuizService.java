package com.epam.quizApp.service;

import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.User;

import java.util.List;

public interface QuizService {
    Boolean save(Quiz quiz);

    Boolean remove(Quiz quiz);

    Quiz getById(Integer id);

    List<Quiz> getByUser(User user);

    List<Quiz> getByTopic(String topic);

}
