package com.kea.madspild.models;

public class Contact {
    private String name;
    private String company;
    private String email;
    private String msg;

    public Contact(String name, String company, String email, String msg) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
