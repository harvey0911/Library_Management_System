package Circulation_System;

import Cataloging_Classification_System.Search_History;

import java.util.HashMap;

public  abstract class User {
    protected int id;
    protected String name;
    protected String phone_number;
    protected String email;
    protected String password;

    HashMap<User, Search_History> User_search_history = new HashMap<>();

    public User() {
    }

    public User(int id, String name, String phone_number, String email, String password) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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


}
