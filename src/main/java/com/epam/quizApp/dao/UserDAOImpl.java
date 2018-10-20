package com.epam.quizApp.dao;

import com.epam.quizApp.model.Quiz;
import com.epam.quizApp.model.Role;
import com.epam.quizApp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDAOImpl implements UserDAO {

    private HashMap<Integer, User> userDB = new HashMap<>();
    private User userStudent = new User();
    private User userStudentSecond = new User();
    private User userTeacher = new User();
    private User userAdmin = new User();
    private User userRequest = new User();

    public UserDAOImpl(){
        //Student
        userStudent.setId(1);
        userStudent.setEnabled(true);
        userStudent.setName("Anakin Skywalker");
        userStudent.setRole(Role.STUDENT);
        userStudent.setPassword("darkSideRules");
        userStudent.setEmail("Anakin@gmail.com");
        //Second student
        userStudentSecond.setId(3);
        userStudentSecond.setEnabled(true);
        userStudentSecond.setName("Luke Skywalker");
        userStudentSecond.setRole(Role.STUDENT);
        userStudentSecond.setPassword("lightSideRules");
        userStudentSecond.setEmail("Luke@gmail.com");
        // Admin
        userAdmin.setId(2);
        userAdmin.setEnabled(true);
        userAdmin.setName("Obi Wan Kenobi");
        userAdmin.setRole(Role.ADMIN);
        userAdmin.setPassword("lightSideRules");
        userAdmin.setEmail("Obi_Wan@yahoo.com");
        //Teacher
        userTeacher.setId(4);
        userTeacher.setEnabled(true);
        userTeacher.setName("Master Yoda");
        userTeacher.setRole(Role.TEACHER);
        userTeacher.setPassword("123");
        userTeacher.setEmail("Yoda");
        //Request for admin
        userRequest.setId(5);
        userRequest.setEnabled(true);
        userRequest.setName("Count Dooku");
        userRequest.setRole(Role.REQUEST);
        userRequest.setPassword("darkSideRules");
        userRequest.setEmail("Dooku@gmail.com");
        //put user in DB
        userDB.put(userStudent.getId(),userStudent);
        userDB.put(userStudentSecond.getId(),userStudentSecond);
        userDB.put(userTeacher.getId(),userTeacher);
        userDB.put(userAdmin.getId(), userAdmin);
        userDB.put(userRequest.getId(), userRequest);

    }


    @Override
    public Boolean save(User user) throws RuntimeException {
        if(user != null) {
            userDB.put(user.getId(), user);
            return true;
        }else{
            throw new RuntimeException("in method save() argument user is null");
        }
    }

    @Override
    public Boolean remove(User user) {
        User userTemp;
        if(user != null){
            userTemp = userDB.remove(user.getId());
        }else{
            throw new RuntimeException("in method remove() argument user is null");
        }
        if(userTemp != null){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public User getById(Integer id) throws RuntimeException {
        if(id == null){
            throw new RuntimeException("in method getById() argument id is null");
        }
        return userDB.get(id);
    }

    @Override
    public List<User> getByName(String name)  throws RuntimeException {
        if(name== null){
            throw new RuntimeException("in method getUsersByName() argument name is null");
        }
        ArrayList<User> resultList = new ArrayList<>();
        for (Map.Entry<Integer, User> entry : userDB.entrySet()) {
            if(name.equals(entry.getValue().getName())){
                resultList.add(entry.getValue());
            }
        }
        return resultList;
    }

    @Override
    public User getByMail(String email) throws RuntimeException {
        if(email== null){
            throw new RuntimeException("in method getUsersByMail() argument email is null");
        }
        for (Map.Entry<Integer, User> entry : userDB.entrySet()) {
            if(email.equals(entry.getValue().getEmail())){
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public List<User> getByRole(Role role) {
        ArrayList<User> resultList = new ArrayList<>();
        if(role == Role.TEACHER){
            resultList.add(userTeacher);
        }else if(role == Role.STUDENT){
            resultList.add(userStudent);
            resultList.add(userStudentSecond);
        }else if(role == Role.REQUEST){
            resultList.add(userRequest);
        }else if(role == Role.ADMIN){
            resultList.add(userAdmin);
        }
        return resultList;
    }

    @Override
    public Boolean setRole(User user, Role role){return true;}

    @Override
    public Boolean setMail(User user, String mail){return true;}

    @Override
    public Boolean setName(User user, String name){return true;}

    @Override
    public Boolean setEnabled(User user, Boolean isEnabled){return true;}

    @Override
    public Boolean setPasssword(User user, String mail){return true;}

    @Override
    public Boolean addPassedQuiz(User user, Quiz quiz){return true;}

    @Override
    public Boolean removeQuiz(User user, Quiz quiz){return true;}
}
