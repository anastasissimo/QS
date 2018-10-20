package com.epam.quizApp.service;

import com.epam.quizApp.model.Question;
import com.epam.quizApp.model.Quiz;

import java.util.List;

public interface QuestionService {

    Boolean save(Question question);

    Boolean remove(Question question);

    Question getById(Integer id);

    List<Question> getByQuiz(Quiz quiz);
}
