package com.epam.quizApp.service;

import com.epam.quizApp.dao.QuizDAO;
import com.epam.quizApp.dao.QuizDAOImpl;
import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class QuizServiceImpl implements QuizService{

    private QuizDAO quizDAO;

    @Autowired
    public QuizServiceImpl(QuizDAO quizDAO) {
        this.quizDAO = quizDAO;
    }

    @Override
    public Boolean save(Quiz quiz) {
        return quizDAO.save(quiz);
    }

    @Override
    public Boolean remove(Quiz quiz) {
        return quizDAO.remove(quiz);
    }

    @Override
    public Quiz getById(Integer id) {
        return quizDAO.getById(id);
    }

    @Override
    public List<Quiz> getByUser(User user) {
        List<Quiz> quizzes = quizDAO.getByUser(user);
        Collections.shuffle(quizzes);
        return quizzes;    }


    @Override
    public List<Quiz> getByTopic(String topic) {
        List<Quiz> quizzes = quizDAO.getByTopic(topic);
        Collections.shuffle(quizzes);
        return quizzes;
    }
}
