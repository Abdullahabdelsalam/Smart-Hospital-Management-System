package com.abdullah.entity;

public class Admin extends Person{
    private String role;

    public Admin() {}

    public Admin(String fullName, int age, String gender,
                 String role) {
        super(fullName, age, gender);
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {}
}
