package com.waverleysoftware.model;

@SuppressWarnings("JavadocType")
public class User {
    private final String name;
    private final String username;
    private final String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User {"
                + "name:" + name
                + "username:" + username
                + "password:" + password
                + '}';
    }

    public User  dummy() {

    return new User ("Dummy", "Dummy", "Dummy");
    }
}
