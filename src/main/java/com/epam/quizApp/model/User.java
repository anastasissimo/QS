package com.epam.quizApp.model;

import java.util.List;
import java.util.Objects;

public class User {

    public static User utilUser;

    private Integer id;
    private String name;
    private String email;
    private String password;
    private Boolean isEnabled;
    private Role role;
    private List<Quiz> passedQiuzzes;

    public User() {}

    public User(Integer id, String name, String email,
                String password, Boolean isEnabled, Role role,
                List<Quiz> passedQiuzzes) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isEnabled = isEnabled;
        this.role = role;
        this.passedQiuzzes = passedQiuzzes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Quiz> getPassedQiuzes() {
        return passedQiuzzes;
    }

    public void setPassedQiuzes(List<Quiz> passedQiuzes) {
        this.passedQiuzzes = passedQiuzes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(isEnabled, user.isEnabled) &&
                getRole() == user.getRole() &&
                Objects.equals(passedQiuzzes, user.passedQiuzzes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getEmail(), getPassword(), isEnabled, getRole(), passedQiuzzes);
    }
}
