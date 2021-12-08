package com.powerengineering.examinationsystem.model.entity;

public class Unit {

    int id;
    String Uname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", Uname='" + Uname + '\'' +
                '}';
    }
}
