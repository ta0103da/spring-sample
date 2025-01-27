package com.example.demo.form;

public class UserForm {
    private String name;
    private String message;

    public UserForm(String name, String message) {
        this.name = name;
        this.message = message;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserForm [name=" + name + ", message=" + message + "]";
    }

    

}
