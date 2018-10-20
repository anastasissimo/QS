package com.epam.quizApp.service;

import com.epam.quizApp.dao.ResultDAO;
import com.epam.quizApp.dao.ResultDAOImpl;
import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.Result;
import com.epam.quizApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    private ResultDAO resultDAO;

    @Autowired
    public ResultServiceImpl(ResultDAO resultDAO) {
        this.resultDAO = resultDAO;
    }

    @Override
    public Boolean save(Result result) {
        return resultDAO.save(result);
    }

    @Override
    public Boolean remove(Result result) {
        return resultDAO.remove(result);
    }

    @Override
    public Result getById(Integer id) {
        return resultDAO.getById(id);
    }

    @Override
    public List<Result> getByUser(User user) {
        List<Result> results = resultDAO.getByUser(user);
        Collections.shuffle(results);
        return results;
    }

    @Override
    public List<Result> getByQuiz(Quiz quiz) {
        List<Result> results = resultDAO.getByQuiz(quiz);
        Collections.shuffle(results);
        return results;
    }

    @Override
    public List<Result> getByDateRange(LocalDate fromDate, LocalDate toDate) {
        List<Result> results = resultDAO.getByDateRange(fromDate, toDate);
        Collections.shuffle(results);
        return results;
    }
}
