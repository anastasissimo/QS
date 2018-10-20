package com.epam.quizApp.dao;

import com.epam.quizApp.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class QuizDAOImpl implements QuizDAO {

    private List<Quiz> list;

    public QuizDAOImpl() {

        User userTeacher = new User();
        userTeacher.setId(4);
        userTeacher.setEnabled(true);
        userTeacher.setName("Master Yoda");
        userTeacher.setRole(Role.TEACHER);
        userTeacher.setPassword("123");
        userTeacher.setEmail("Yoda");

        list = new ArrayList<Quiz>(){{
            add(new Quiz(0, "java", "JavaTest 0", userTeacher, true, new ArrayList<Question>(){
                {
                    add(new Question(21101, Collections.emptyList(), "Посчитай 2+2*2", new ArrayList<Answer>() {{
                        add(new Answer(1102, "2", false));
                        add(new Answer(1103, "4", false));
                        add(new Answer(1104, "6", true));
                        add(new Answer(1105, "8", false));
                    }}));
                    add(new Question(212, Collections.emptyList(), "В чем квинтэссенция концептуальности" +
                            "основы вашей весьма одиозной парадигмы политической амбивалентности?", new ArrayList<Answer>() {{
                        add(new Answer(1106, "ЭЭЭЭЭЭЭЭЭэээ", false));
                        add(new Answer(1107, "Бросай курить всякое", true));
                        add(new Answer(1108, "Ударить, чтобы не умничал", true));
                    }}));
                    add(new Question(213, Collections.emptyList(), "Сколько овец насчитал вчера перед сном?", new ArrayList<Answer>() {{
                        add(new Answer(1110, "<10", false));
                        add(new Answer(1111, "10-50", false));
                        add(new Answer(1112, "51-100", false));
                        add(new Answer(1113, ">100", false));
                        add(new Answer(1113, "Сон? Что это?", true));
                    }}));
                }}));
            add(new Quiz(1, "java", "JavaTest 1", userTeacher, true, new ArrayList<Question>(){
                {
                    add(new Question(22101, Collections.emptyList(), "TempQuestion1", new ArrayList<Answer>() {{
                        add(new Answer(2102, "TempStatement2", false));
                        add(new Answer(2103, "TempStatement3", false));
                        add(new Answer(2104, "TempStatement4", true));
                        add(new Answer(2105, "TempStatement5", false));
                    }}));
                    add(new Question(222, Collections.emptyList(), "TempQuestion2", new ArrayList<Answer>() {{
                        add(new Answer(2106, "TempStatement6", false));
                        add(new Answer(2107, "TempStatement7", false));
                        add(new Answer(2108, "TempStatement8", true));
                        add(new Answer(2109, "TempStatement9", false));
                    }}));
                    add(new Question(223, Collections.emptyList(), "TempQuestion3", new ArrayList<Answer>() {{
                        add(new Answer(2110, "TempStatement10", false));
                        add(new Answer(2111, "TempStatement11", false));
                        add(new Answer(2112, "TempStatement12", true));
                        add(new Answer(2113, "TempStatement13", false));
                    }}));
                    add(new Question(224, Collections.emptyList(), "TempQuestion4", new ArrayList<Answer>() {{
                        add(new Answer(2114, "TempStatement14", false));
                        add(new Answer(2115, "TempStatement15", false));
                        add(new Answer(2116, "TempStatement16", false));
                        add(new Answer(2117, "TempStatement17", true));
                        add(new Answer(2118, "TempStatement18", false));
                    }}));
                }}));
            add(new Quiz(2, "java", "JavaTest 2", userTeacher, true, new ArrayList<Question>(){
                {
                    add(new Question(23101, Collections.emptyList(), "TempQuestion1", new ArrayList<Answer>() {{
                        add(new Answer(33102, "TempStatement2", false));
                        add(new Answer(3103, "TempStatement3", false));
                        add(new Answer(3104, "TempStatement4", true));
                        add(new Answer(3105, "TempStatement5", false));
                    }}));
                    add(new Question(232, Collections.emptyList(), "TempQuestion2", new ArrayList<Answer>() {{
                        add(new Answer(3106, "TempStatement6", false));
                        add(new Answer(3107, "TempStatement7", false));
                        add(new Answer(3108, "TempStatement8", true));
                        add(new Answer(3109, "TempStatement9", false));
                    }}));
                    add(new Question(233, Collections.emptyList(), "TempQuestion3", new ArrayList<Answer>() {{
                        add(new Answer(3110, "TempStatement10", false));
                        add(new Answer(3111, "TempStatement11", false));
                        add(new Answer(3112, "TempStatement12", true));
                        add(new Answer(3113, "TempStatement13", false));
                    }}));
                    add(new Question(234, Collections.emptyList(), "TempQuestion4", new ArrayList<Answer>() {{
                        add(new Answer(3114, "TempStatement14", false));
                        add(new Answer(3115, "TempStatement15", false));
                        add(new Answer(3116, "TempStatement16", false));
                        add(new Answer(3117, "TempStatement17", true));
                        add(new Answer(3118, "TempStatement18", false));
                    }}));
                }}));
            add(new Quiz(3, "java", "JavaTest 3", userTeacher, true, new ArrayList<Question>(){
                {
                    add(new Question(24101, Collections.emptyList(), "TempQuestion1", new ArrayList<Answer>() {{
                        add(new Answer(4102, "TempStatement2", false));
                        add(new Answer(4103, "TempStatement3", false));
                        add(new Answer(4104, "TempStatement4", true));
                        add(new Answer(4105, "TempStatement5", false));
                    }}));
                    add(new Question(242, Collections.emptyList(), "TempQuestion2", new ArrayList<Answer>() {{
                        add(new Answer(4106, "TempStatement6", false));
                        add(new Answer(4107, "TempStatement7", false));
                        add(new Answer(4108, "TempStatement8", true));
                        add(new Answer(4109, "TempStatement9", false));
                    }}));
                    add(new Question(243, Collections.emptyList(), "TempQuestion3", new ArrayList<Answer>() {{
                        add(new Answer(4110, "TempStatement10", false));
                        add(new Answer(4111, "TempStatement11", false));
                        add(new Answer(4112, "TempStatement12", true));
                        add(new Answer(4113, "TempStatement13", false));
                    }}));
                    add(new Question(244, Collections.emptyList(), "TempQuestion4", new ArrayList<Answer>() {{
                        add(new Answer(4114, "TempStatement14", false));
                        add(new Answer(4115, "TempStatement15", false));
                        add(new Answer(4116, "TempStatement16", false));
                        add(new Answer(4117, "TempStatement17", true));
                        add(new Answer(4118, "TempStatement18", false));
                    }}));
                }}));
        }};
    }

    @Override
    public Boolean save(Quiz quiz) {
        return true;
    }

    @Override
    public Boolean remove(Quiz quiz) {
        return true;
    }

    @Override
    public Quiz getById(Integer quizId) {
        return list.get(quizId);
    }

    @Override
    public List<Quiz> getByUser(User user) {

        return list.stream().filter(i -> i.getAuthor().equals(user)).collect(Collectors.toList());

    }
    @Override
    public List<Quiz> getByTopic(String topic) {
        return list;
        //return list.stream().filter(i -> i.getTopic().equals(topic)).collect(Collectors.toList());
    }

}