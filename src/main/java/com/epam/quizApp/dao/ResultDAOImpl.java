package com.epam.quizApp.dao;

import com.epam.quizApp.model.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class ResultDAOImpl implements ResultDAO {

    @Override
    public Boolean save(Result result) {
        return true;
    }

    @Override
    public Boolean remove(Result result) {
        return true;
    }

    @Override
    public Result getById(Integer resultId) {
        return new Result(1, new User(1, "Arnold", "heyArnold@epam.com",
                "1", true, Role.STUDENT, new ArrayList<>()),
                LocalDate.of(2018, 2, 3),
                new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
        {
            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                add(new Answer(102, "TempStatement2", false));
                add(new Answer(103, "TempStatement3", false));
                add(new Answer(104, "TempStatement4", true));
                add(new Answer(105, "TempStatement5", false));
            }}));
            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                add(new Answer(106, "TempStatement6", false));
                add(new Answer(107, "TempStatement7", false));
                add(new Answer(108, "TempStatement8", true));
                add(new Answer(109, "TempStatement9", false));
            }}));
            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                add(new Answer(110, "TempStatement10", false));
                add(new Answer(111, "TempStatement11", false));
                add(new Answer(112, "TempStatement12", true));
                add(new Answer(113, "TempStatement13", false));
            }}));
            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                add(new Answer(114, "TempStatement14", false));
                add(new Answer(115, "TempStatement15", false));
                add(new Answer(116, "TempStatement16", false));
                add(new Answer(117, "TempStatement17", true));
                add(new Answer(118, "TempStatement18", false));
            }}));
        }}), 2);
    }

    @Override
    public List<Result> getByUser(User user) {
        return new ArrayList<Result>(){{
            add(new Result(1, new User(2, "Arnold", "heyArnold@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
            add(new Result(2, new User(2, "Askold", "heyAskold@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
            add(new Result(3, new User(3, "Benedict", "heyBen@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
            add(new Result(4, new User(4, "LilPeep", "lilpeep@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
        }};
    }

    @Override
    public List<Result> getByQuiz(Quiz quiz) {
        return new ArrayList<Result>(){{
            add(new Result(1, new User(2, "Arnold", "heyArnold@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
            add(new Result(2, new User(2, "Askold", "heyAskold@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
            add(new Result(3, new User(3, "Benedict", "heyBen@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
            add(new Result(4, new User(4, "LilPeep", "lilpeep@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
        }};
    }

    @Override
    public List<Result> getByDateRange(LocalDate fromDate, LocalDate toDate) {
        return new ArrayList<Result>(){{
            add(new Result(1, new User(2, "Arnold", "heyArnold@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
            add(new Result(2, new User(2, "Askold", "heyAskold@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
            add(new Result(3, new User(3, "Benedict", "heyBen@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
            add(new Result(4, new User(4, "LilPeep", "lilpeep@epam.com",
                    "1", true, Role.STUDENT, new ArrayList<>()),
                    LocalDate.of(2018, 2, 3),
                    new Quiz(1, "java", "JavaTest", new User(), true, new ArrayList<Question>(){
                        {
                            add(new Question(101, Arrays.asList("java", "javascript", "oop"), "TempQuestion1", new ArrayList<Answer>() {{
                                add(new Answer(102, "TempStatement2", false));
                                add(new Answer(103, "TempStatement3", false));
                                add(new Answer(104, "TempStatement4", true));
                                add(new Answer(105, "TempStatement5", false));
                            }}));
                            add(new Question(2, Arrays.asList("java", "javascript", "networks"), "TempQuestion2", new ArrayList<Answer>() {{
                                add(new Answer(106, "TempStatement6", false));
                                add(new Answer(107, "TempStatement7", false));
                                add(new Answer(108, "TempStatement8", true));
                                add(new Answer(109, "TempStatement9", false));
                            }}));
                            add(new Question(3, Arrays.asList("c#", "network", "oop"), "TempQuestion3", new ArrayList<Answer>() {{
                                add(new Answer(110, "TempStatement10", false));
                                add(new Answer(111, "TempStatement11", false));
                                add(new Answer(112, "TempStatement12", true));
                                add(new Answer(113, "TempStatement13", false));
                            }}));
                            add(new Question(4, Arrays.asList("ajax", "javascript"), "TempQuestion4", new ArrayList<Answer>() {{
                                add(new Answer(114, "TempStatement14", false));
                                add(new Answer(115, "TempStatement15", false));
                                add(new Answer(116, "TempStatement16", false));
                                add(new Answer(117, "TempStatement17", true));
                                add(new Answer(118, "TempStatement18", false));
                            }}));
                        }}), 2));
        }};
    }
}