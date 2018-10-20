package com.epam.quizApp.dao;

import com.epam.quizApp.model.Answer;
import com.epam.quizApp.model.Question;

import java.util.List;

public interface AnswerDAO {

    Boolean save(Answer answer);

    Boolean remove(Answer answer);

    Answer getById(Integer answerId);

    List<Answer> getByQuestion(Question question);

}
