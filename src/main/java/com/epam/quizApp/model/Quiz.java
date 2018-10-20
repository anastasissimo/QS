package com.epam.quizApp.model;

import java.util.List;

public class Quiz {

    private Integer id;
    private String topic;
    private String title;
    private User author;
    private Boolean isEnabled;
    private List<Question> questions;

    public Quiz() {
    }

    public Quiz(Integer id, String topic, String title, User author, Boolean isEnabled, List<Question> questions) {
        this.id = id;
        this.topic = topic;
        this.title = title;
        this.author = author;
        this.isEnabled = isEnabled;
        this.questions = questions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
