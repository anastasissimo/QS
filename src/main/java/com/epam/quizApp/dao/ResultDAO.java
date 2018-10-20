package com.epam.quizApp.dao;

import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.Result;
import com.epam.quizApp.model.User;

import java.time.LocalDate;
import java.util.List;

public interface ResultDAO {

    Boolean save(Result result);

    Boolean remove(Result result);

    Result getById(Integer resultId);

    List<Result> getByUser(User user);

    List<Result> getByQuiz(Quiz quiz);

    List<Result> getByDateRange(LocalDate fromDate, LocalDate toDate);
}
