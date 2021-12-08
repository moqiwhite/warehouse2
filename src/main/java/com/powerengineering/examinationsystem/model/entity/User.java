package com.powerengineering.examinationsystem.model.entity;

public class User {

    private int userId;//id
    private String userName;//姓名
    private String userCard;//身份证
    private String userPhone;//手机号
    private String userMail;//邮箱
    private int userAuth;//权限
    private String userPassword;//密码
    private int kaochangId;//考场id
    private int unitId;//单位id

    public int getKaochangId() {
        return kaochangId;
    }

    public void setKaochangId(int kaochangId) {
        this.kaochangId = kaochangId;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public int getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(int userAuth) {
        this.userAuth = userAuth;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userCard='" + userCard + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userAuth=" + userAuth +
                ", userPassword='" + userPassword + '\'' +
                ", kaochangId=" + kaochangId +
                ", unitId=" + unitId +
                '}';
    }
}
