package com.epam.quizApp.service;

import com.epam.quizApp.dao.QuestionDAO;
import com.epam.quizApp.dao.QuestionDAOImpl;
import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionDAO questionDAO;

    @Autowired
    public QuestionServiceImpl(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    @Override
    public Boolean save(Question question) {
        return questionDAO.save(question);
    }

    @Override
    public Boolean remove(Question question) {
        return questionDAO.remove(question);
    }

    @Override
    public Question getById(Integer id) {
        return questionDAO.getById(id);
    }

    @Override
    public List<Question> getByQuiz(Quiz quiz) {
        return questionDAO.getByQuiz(quiz);
    }

}
