package com.example.demo.form;

public class UserForm {
    private String name;
    private String newMessage;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNewMessage() {
        return newMessage;
    }
    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }
    @Override
    public String toString() {
        return "UserForm [name=" + name + ", newMessage=" + newMessage + "]";
    }

    

}
