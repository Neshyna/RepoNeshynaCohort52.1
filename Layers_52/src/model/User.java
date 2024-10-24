package model;

import utils.MyArrayList;
import utils.MyList;

public class User {
    private String email;
    private String password;
    private final MyList<Car> userCars;
    private Role role;

    public User(String email, String password) {
        this.userCars = new MyArrayList<>();
        this.email = email;
        this.password = password;
        this.role = Role.USER;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public MyList<Car> getUserCars() {
        return userCars;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userCars=" + userCars +
                '}';
    }
}
