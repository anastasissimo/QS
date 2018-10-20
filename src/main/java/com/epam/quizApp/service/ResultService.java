package com.epam.quizApp.service;

import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.Result;
import com.epam.quizApp.model.User;

import java.time.LocalDate;
import java.util.List;

public interface ResultService {

    Boolean save(Result result);

    Boolean remove(Result result);

    Result getById(Integer id);

    List<Result> getByUser(User user);

    List<Result> getByQuiz(Quiz quiz);

    List<Result> getByDateRange(LocalDate fromDate, LocalDate toDate);

}
