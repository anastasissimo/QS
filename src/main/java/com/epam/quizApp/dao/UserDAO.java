package com.epam.quizApp.dao;

import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.Role;
import com.epam.quizApp.model.User;
import java.util.List;

public interface UserDAO {

    Boolean save(User user);

    Boolean remove(User user);

    User getById(Integer id);

    List<User> getByName(String name);

    User getByMail(String email);

    List<User> getByRole(Role role);

    Boolean setRole(User user, Role role);

    Boolean setMail(User user, String mail);

    Boolean setName(User user, String name);

    Boolean setEnabled(User user, Boolean isEnabled);

    Boolean setPasssword(User user, String mail);

    Boolean addPassedQuiz(User user, Quiz quiz);

    Boolean removeQuiz(User user, Quiz quiz);


}
