package com.ssm.model;

public class UserAccount {
    private Integer aid;

    private Integer userid;

    private Float totalmoney;

    private Float unreturnamoney;

    private Float unreturnamount;

    private Float borrowlimit;

    private Float remainborrowlimit;

    public UserAccount(Integer aid, Integer userid, Float totalmoney, Float unreturnamoney, Float unreturnamount, Float borrowlimit, Float remainborrowlimit) {
        this.aid = aid;
        this.userid = userid;
        this.totalmoney = totalmoney;
        this.unreturnamoney = unreturnamoney;
        this.unreturnamount = unreturnamount;
        this.borrowlimit = borrowlimit;
        this.remainborrowlimit = remainborrowlimit;
    }

    public UserAccount() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Float getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Float totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Float getUnreturnamoney() {
        return unreturnamoney;
    }

    public void setUnreturnamoney(Float unreturnamoney) {
        this.unreturnamoney = unreturnamoney;
    }

    public Float getUnreturnamount() {
        return unreturnamount;
    }

    public void setUnreturnamount(Float unreturnamount) {
        this.unreturnamount = unreturnamount;
    }

    public Float getBorrowlimit() {
        return borrowlimit;
    }

    public void setBorrowlimit(Float borrowlimit) {
        this.borrowlimit = borrowlimit;
    }

    public Float getRemainborrowlimit() {
        return remainborrowlimit;
    }

    public void setRemainborrowlimit(Float remainborrowlimit) {
        this.remainborrowlimit = remainborrowlimit;
    }
}