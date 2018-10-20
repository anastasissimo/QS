package com.epam.quizApp.dao;

import com.epam.quizApp.model.Answer;
import com.epam.quizApp.model.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnswerDAOImpl implements AnswerDAO {

    @Override
    public Boolean save(Answer answer) {
        return true;
    }

    @Override
    public Boolean remove(Answer answer) {
        return true;
    }

    @Override
    public Answer getById(Integer answerId) {
        return new Answer(1, "TempStatement1", true);
    }

    @Override
    public List<Answer> getByQuestion(Question question) {
        return new ArrayList<Answer>(){{
            add(new Answer(2, "TempStatement2", false));
            add(new Answer(3, "TempStatement3", false));
            add(new Answer(4, "TempStatement4", true));
            add(new Answer(5, "TempStatement5", false));
        }};
    }
}