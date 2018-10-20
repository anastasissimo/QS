package com.epam.quizApp.model;

import java.util.List;

public class Question {

    private Integer id;
    private List<String> tags;
    private String questionText;
    private List<Answer> answers;

    public Question() {
    }

    public Question(Integer id, List<String> tags, String questionText, List<Answer> answers) {
        this.id = id;
        this.tags = tags;
        this.questionText = questionText;
        this.answers = answers;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
