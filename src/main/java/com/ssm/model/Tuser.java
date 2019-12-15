package com.ssm.model;

import lombok.ToString;

import java.util.Date;

@ToString
public class Tuser {
    private Integer userid;

    private String username;

    private String loginpass;

    private String salt;

    private String email;

    private Long phone;

    private String userimage;

    private Integer emailcheck;

    private Integer phonecheck;

    private Integer realnamecheck;

    private Integer islock;

    private Date registertime;

    public Tuser(Integer userid, String username, String loginpass, String salt, String email, Long phone, String userimage, Integer emailcheck, Integer phonecheck, Integer realnamecheck, Integer islock, Date registertime) {
        this.userid = userid;
        this.username = username;
        this.loginpass = loginpass;
        this.salt = salt;
        this.email = email;
        this.phone = phone;
        this.userimage = userimage;
        this.emailcheck = emailcheck;
        this.phonecheck = phonecheck;
        this.realnamecheck = realnamecheck;
        this.islock = islock;
        this.registertime = registertime;
    }

    public Tuser() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }

    public Integer getEmailcheck() {
        return emailcheck;
    }

    public void setEmailcheck(Integer emailcheck) {
        this.emailcheck = emailcheck;
    }

    public Integer getPhonecheck() {
        return phonecheck;
    }

    public void setPhonecheck(Integer phonecheck) {
        this.phonecheck = phonecheck;
    }

    public Integer getRealnamecheck() {
        return realnamecheck;
    }

    public void setRealnamecheck(Integer realnamecheck) {
        this.realnamecheck = realnamecheck;
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }
}