package com.powerengineering.examinationsystem.model.vo;

public class PaperVo {

    private int id;
    private String userName;
    private String pnameStr;//试卷名称
    private String uidStr;//单位,对应的某个单位的
    private String bsidStr;//题库类别, 1理论,2实操
    private String btidStr;//题库类型 1正考  2练习
    private String answer;//答案
    private String bidStr;//题库  1工种 2技能
    private String tidStr;//标签库的id
    private String cridStr;//工种等级 1国标 2行标  3企标
    private String midStr;//专业类别
    private String userIdStr;//负责人id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserIdStr() {
        return userIdStr;
    }

    public void setUserIdStr(String userIdStr) {
        this.userIdStr = userIdStr;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPnameStr() {
        return pnameStr;
    }

    public void setPnameStr(String pnameStr) {
        this.pnameStr = pnameStr;
    }

    public String getUidStr() {
        return uidStr;
    }

    public void setUidStr(String uidStr) {
        this.uidStr = uidStr;
    }

    public String getBsidStr() {
        return bsidStr;
    }

    public void setBsidStr(String bsidStr) {
        this.bsidStr = bsidStr;
    }

    public String getBtidStr() {
        return btidStr;
    }

    public void setBtidStr(String btidStr) {
        this.btidStr = btidStr;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getBidStr() {
        return bidStr;
    }

    public void setBidStr(String bidStr) {
        this.bidStr = bidStr;
    }

    public String getTidStr() {
        return tidStr;
    }

    public void setTidStr(String tidStr) {
        this.tidStr = tidStr;
    }

    public String getCridStr() {
        return cridStr;
    }

    public void setCridStr(String cridStr) {
        this.cridStr = cridStr;
    }

    public String getMidStr() {
        return midStr;
    }

    public void setMidStr(String midStr) {
        this.midStr = midStr;
    }

    @Override
    public String toString() {
        return "PaperVo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", pnameStr='" + pnameStr + '\'' +
                ", uidStr='" + uidStr + '\'' +
                ", bsidStr='" + bsidStr + '\'' +
                ", btidStr='" + btidStr + '\'' +
                ", answer='" + answer + '\'' +
                ", bidStr='" + bidStr + '\'' +
                ", tidStr='" + tidStr + '\'' +
                ", cridStr='" + cridStr + '\'' +
                ", midStr='" + midStr + '\'' +
                ", userIdStr='" + userIdStr + '\'' +
                '}';
    }
}
