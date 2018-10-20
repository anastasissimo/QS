package com.epam.quizApp.dao;

import com.epam.quizApp.model.Answer;
import com.epam.quizApp.model.Question;
import com.epam.quizApp.model.Quiz;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class QuestionDAOImpl implements QuestionDAO {

    @Override
    public Boolean save(Question question) {
        return true;
    }

    @Override
    public Boolean remove(Question question) {
        return true;
    }

    @Override
    public Question getById(Integer questionId) {
        return new Question(1, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>(){{
            add(new Answer(2, "TempStatement2", false));
            add(new Answer(3, "TempStatement3", false));
            add(new Answer(4, "TempStatement4", true));
            add(new Answer(5, "TempStatement5", false));
        }});
    }

    @Override
    public List<Question> getByQuiz(Quiz quiz) {
        return new ArrayList<Question>(){
            {
                add(new Question(1, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                    add(new Answer(2, "TempStatement2", false));
                    add(new Answer(3, "TempStatement3", false));
                    add(new Answer(4, "TempStatement4", true));
                    add(new Answer(5, "TempStatement5", false));
                }}));
                add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                    add(new Answer(6, "TempStatement6", false));
                    add(new Answer(7, "TempStatement7", false));
                    add(new Answer(8, "TempStatement8", true));
                    add(new Answer(9, "TempStatement9", false));
                }}));
                add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                    add(new Answer(10, "TempStatement10", false));
                    add(new Answer(11, "TempStatement11", false));
                    add(new Answer(12, "TempStatement12", true));
                    add(new Answer(13, "TempStatement13", false));
                }}));
                add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                    add(new Answer(14, "TempStatement14", false));
                    add(new Answer(15, "TempStatement15", false));
                    add(new Answer(16, "TempStatement16", false));
                    add(new Answer(17, "TempStatement17", true));
                    add(new Answer(18, "TempStatement18", false));
                }}));
            }};
    }
}

