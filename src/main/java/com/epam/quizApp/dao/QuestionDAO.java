package com.epam.quizApp.dao;

import com.epam.quizApp.model.Question;
import com.epam.quizApp.model.Quiz;

import java.util.List;

public interface QuestionDAO {

    Boolean save(Question question);
    Boolean remove(Question question);

    Question getById(Integer questionId);

    List<Question> getByQuiz(Quiz quiz);

}
