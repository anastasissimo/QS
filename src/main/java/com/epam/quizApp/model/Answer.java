package com.epam.quizApp.model;

public class Answer {
    private Integer id;
    private String variant;
    private Boolean isCorrect;

    public Answer() {
    }

    public Answer(Integer id, String variant, Boolean isCorrect) {
        this.id = id;
        this.variant = variant;
        this.isCorrect = isCorrect;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }
}
