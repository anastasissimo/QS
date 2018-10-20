package com.epam.quizApp.service;

import com.epam.quizApp.model.Answer;
import com.epam.quizApp.model.Question;
import java.util.List;

public interface AnswerService {

    Boolean save(Answer answer);

    Boolean remove(Answer answer);

    Answer getById(Integer id);

    List<Answer> getByQuestion(Question question);
}
