package com.example.annisa.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Student {
    private int id;
    private String noreg;
    private String name;
    private String email;
    private String phone;

    public Student(int id, String noreg, String name, String email, String phone) {
        this.id = id;
        this.noreg = noreg;
        this.name = name;
        this.email = email;
        this.phone = phone;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoreg() {
        return noreg;
    }

    public void setNoreg(String noreg) {
        this.noreg = noreg;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
