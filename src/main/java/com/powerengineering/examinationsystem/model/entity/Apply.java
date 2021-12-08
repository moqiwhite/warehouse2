package com.powerengineering.examinationsystem.model.entity;

public class Apply {

    int id, uId;
    String name,yun,grade;
    String createTime,explain;


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



    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getYun() {
        return yun;
    }

    public void setYun(String yun) {
        this.yun = yun;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "id=" + id +
                ", uId=" + uId +
                ", name='" + name + '\'' +
                ", yun='" + yun + '\'' +
                ", grade='" + grade + '\'' +
                ", createTime='" + createTime + '\'' +
                ", explain='" + explain + '\'' +
                '}';
    }
}
