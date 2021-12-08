package com.powerengineering.examinationsystem.model.entity;

public class Paper {


    private int id;//试卷库,对应每张试卷
    private String PName;//试卷名称
    private int Uid;//单位,对应的某个单位的
    private int Bsid;//题库类别, 1理论,2实操
    private int Btid;//题库类型 1正考  2练习
    private String answer;//答案
    private int Bid;//题库  1工种 2技能
    private int Tid;//标签库的id
    private int Crid;//工种等级 1国标 2行标  3企标
    private int Mid;//专业类别
    private int userId;//负责人id

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public int getBsid() {
        return Bsid;
    }

    public void setBsid(int bsid) {
        Bsid = bsid;
    }

    public int getBtid() {
        return Btid;
    }

    public void setBtid(int btid) {
        Btid = btid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getBid() {
        return Bid;
    }

    public void setBid(int bid) {
        Bid = bid;
    }

    public int getTid() {
        return Tid;
    }

    public void setTid(int tid) {
        Tid = tid;
    }

    public int getCrid() {
        return Crid;
    }

    public void setCrid(int crid) {
        Crid = crid;
    }

    public int getMid() {
        return Mid;
    }

    public void setMid(int mid) {
        Mid = mid;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id=" + id +
                ", PName='" + PName + '\'' +
                ", Uid=" + Uid +
                ", Bsid=" + Bsid +
                ", Btid=" + Btid +
                ", answer='" + answer + '\'' +
                ", Bid=" + Bid +
                ", Tid=" + Tid +
                ", Crid=" + Crid +
                ", Mid=" + Mid +
                ", userId=" + userId +
                '}';
    }
}
