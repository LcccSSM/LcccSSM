package com.ssm.model;

import lombok.ToString;

@ToString
public class StateStatus {
    private Integer asid;

    private Integer auserid;

    private String arealname;

    private String asidsex;

    private String asidcardno;

    private String asidaddress;

    private String asidimg;

    private String asidimg2;

    public StateStatus(Integer asid, Integer auserid, String arealname, String asidsex, String asidcardno, String asidaddress, String asidimg, String asidimg2) {
        this.asid = asid;
        this.auserid = auserid;
        this.arealname = arealname;
        this.asidsex = asidsex;
        this.asidcardno = asidcardno;
        this.asidaddress = asidaddress;
        this.asidimg = asidimg;
        this.asidimg2 = asidimg2;
    }

    public StateStatus() {
        super();
    }

    public Integer getAsid() {
        return asid;
    }

    public void setAsid(Integer asid) {
        this.asid = asid;
    }

    public Integer getAuserid() {
        return auserid;
    }

    public void setAuserid(Integer auserid) {
        this.auserid = auserid;
    }

    public String getArealname() {
        return arealname;
    }

    public void setArealname(String arealname) {
        this.arealname = arealname;
    }

    public String getAsidsex() {
        return asidsex;
    }

    public void setAsidsex(String asidsex) {
        this.asidsex = asidsex;
    }

    public String getAsidcardno() {
        return asidcardno;
    }

    public void setAsidcardno(String asidcardno) {
        this.asidcardno = asidcardno;
    }

    public String getAsidaddress() {
        return asidaddress;
    }

    public void setAsidaddress(String asidaddress) {
        this.asidaddress = asidaddress;
    }

    public String getAsidimg() {
        return asidimg;
    }

    public void setAsidimg(String asidimg) {
        this.asidimg = asidimg;
    }

    public String getAsidimg2() {
        return asidimg2;
    }

    public void setAsidimg2(String asidimg2) {
        this.asidimg2 = asidimg2;
    }
}