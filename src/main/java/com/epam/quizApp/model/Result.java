package com.epam.quizApp.model;

import java.time.LocalDate;

public class Result {

    private Integer id;
    private User user;
    private LocalDate date;
    private Quiz quiz;
    private Integer correctAnswers;

    public Result() {
    }

    public Result(Integer id, User user, LocalDate date, Quiz quiz, Integer correctAnswers) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.quiz = quiz;
        this.correctAnswers = correctAnswers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public Integer getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(Integer correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
}
