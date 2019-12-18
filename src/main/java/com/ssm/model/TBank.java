package com.ssm.model;

import lombok.ToString;

import java.util.Date;
@ToString
public class TBank {
    private Integer abid;

    private Integer auserid;

    private String abank;

    private String banktype;

    private String abankphone;

    private Date addtime;

    private String bpassword;

    private String salt;

    public TBank(Integer abid, Integer auserid, String abank, String banktype, String abankphone, Date addtime, String bpassword, String salt) {
        this.abid = abid;
        this.auserid = auserid;
        this.abank = abank;
        this.banktype = banktype;
        this.abankphone = abankphone;
        this.addtime = addtime;
        this.bpassword = bpassword;
        this.salt = salt;
    }

    public TBank() {
        super();
    }

    public Integer getAbid() {
        return abid;
    }

    public void setAbid(Integer abid) {
        this.abid = abid;
    }

    public Integer getAuserid() {
        return auserid;
    }

    public void setAuserid(Integer auserid) {
        this.auserid = auserid;
    }

    public String getAbank() {
        return abank;
    }

    public void setAbank(String abank) {
        this.abank = abank;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    public String getAbankphone() {
        return abankphone;
    }

    public void setAbankphone(String abankphone) {
        this.abankphone = abankphone;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getBpassword() {
        return bpassword;
    }

    public void setBpassword(String bpassword) {
        this.bpassword = bpassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}