package com.powerengineering.examinationsystem.model.entity;

public class Tag {

    int id;
    String Tname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", Tname='" + Tname + '\'' +
                '}';
    }
}
