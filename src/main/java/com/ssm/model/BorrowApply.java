package com.ssm.model;

public class BorrowApply {
    private Integer jid;

    private Integer userid;

    private String realname;

    private String asidcardno;

    private Long phone;

    private Float money;

    private Integer timelimit;

    private String addtime;

    private Integer status;

    private Integer verifyuser;

    private String verifytime;

    public BorrowApply(Integer jid, Integer userid, String realname, String asidcardno, Long phone, Float money, Integer timelimit, String addtime, Integer status, Integer verifyuser, String verifytime) {
        this.jid = jid;
        this.userid = userid;
        this.realname = realname;
        this.asidcardno = asidcardno;
        this.phone = phone;
        this.money = money;
        this.timelimit = timelimit;
        this.addtime = addtime;
        this.status = status;
        this.verifyuser = verifyuser;
        this.verifytime = verifytime;
    }

    public BorrowApply() {
        super();
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getAsidcardno() {
        return asidcardno;
    }

    public void setAsidcardno(String asidcardno) {
        this.asidcardno = asidcardno;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Integer timelimit) {
        this.timelimit = timelimit;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVerifyuser() {
        return verifyuser;
    }

    public void setVerifyuser(Integer verifyuser) {
        this.verifyuser = verifyuser;
    }

    public String getVerifytime() {
        return verifytime;
    }

    public void setVerifytime(String verifytime) {
        this.verifytime = verifytime;
    }
}