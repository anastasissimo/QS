package com.epam.quizApp.service;

import com.epam.quizApp.dao.UserDAO;
import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.Role;
import com.epam.quizApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User getByMail(String mail) {
        if (mail != null){
            return userDAO.getByMail(mail);
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public Boolean createUser(User user){
        if (user!= null){
            return userDAO.save(user);
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public List<User> getTeacherRequests(){
       return userDAO.getByRole(Role.REQUEST);
    }

    @Override
    public Boolean processTeacherRequests(Boolean isApproved, User user) {
        if (isApproved != null && user != null) {

            if (isApproved) {
                user.setRole(Role.TEACHER);
                return userDAO.save(user);
            } else {
                user.setEnabled(false);
                return userDAO.save(user);
                // TODO message
            }
        }else{
            throw  new RuntimeException();
        }
    }

    @Override
    public Boolean addPassedQuiz(User user, Quiz quiz){
        if(user != null && quiz != null) {
            user.getPassedQiuzes().add(quiz); // TODO MAKE IT BY MORE SAFETY WAY
            return userDAO.save(user);
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public Boolean deletePassedQuiz(User user, Quiz quiz){
        if(user != null && quiz != null) {
            user.getPassedQiuzes().remove(quiz); // TODO MAKE IT BY MORE SAFETY WAY
            return userDAO.save(user);
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public Boolean setRole(User user, Role role){
        if(user != null && role != null) {
            user.setRole(role); //
            return userDAO.save(user);
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public Boolean setMail(User user, String mail){

        if(user != null && mail != null) {
            user.setEmail(mail);
            return userDAO.save(user);
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public Boolean setName(User user, String name){
        if(user != null && name != null) {
            user.setName(name);
            return userDAO.save(user);
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public Boolean setEnabled(User user, Boolean isEnabled){
        if(user != null && isEnabled != null) {
            user.setEnabled(isEnabled);
            return userDAO.save(user);
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public Boolean setPasssword(User user, String password){
        if(user != null && password != null) {
            user.setPassword(password); //TODO where we need to hash password
            return userDAO.save(user);
        }else{
            throw new RuntimeException();
        }
    }
}
