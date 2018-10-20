package com.epam.quizApp.service;

import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.Role;
import com.epam.quizApp.model.User;

import java.util.List;

public interface UserService {

   User getByMail(String mail);

   Boolean createUser(User user);

   List<User> getTeacherRequests();

   Boolean processTeacherRequests(Boolean isApproved, User user);

   Boolean addPassedQuiz(User user, Quiz quiz);

   Boolean deletePassedQuiz(User user, Quiz quiz);

   Boolean setRole(User user, Role role);

   Boolean setMail(User user, String mail);

   Boolean setName(User user, String name);

   Boolean setEnabled(User user, Boolean isEnabled);

   Boolean setPasssword(User user, String mail);

}
