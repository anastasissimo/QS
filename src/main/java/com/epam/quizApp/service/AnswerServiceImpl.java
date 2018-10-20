package com.epam.quizApp.service;

import com.epam.quizApp.dao.AnswerDAO;
import com.epam.quizApp.dao.AnswerDAOImpl;
import com.epam.quizApp.model.Answer;
import com.epam.quizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    private AnswerDAO answerDAO;

    @Autowired
    public AnswerServiceImpl(AnswerDAO answerDAO) {
        this.answerDAO = answerDAO;
    }

    @Override
    public Boolean save(Answer answer) {
        return answerDAO.save(answer);
    }

    @Override
    public Boolean remove(Answer answer) {
        return answerDAO.remove(answer);
    }

    @Override
    public Answer getById(Integer id) {
        return answerDAO.getById(id);
    }

    @Override
    public List<Answer> getByQuestion(Question question) {
        List<Answer> answers = answerDAO.getByQuestion(question);
        Collections.shuffle(answers);
        return answers;
    }
}
