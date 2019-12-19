package com.ssm.model;

import lombok.ToString;

@ToString
public class TUserzl {
    private Integer zuid;

    private Integer userid;

    private String zstudent;

    private String zmoney;

    private String zmarriage;

    private String zchild;

    private String zhome;

    public TUserzl(Integer zuid, Integer userid, String zstudent, String zmoney, String zmarriage, String zchild, String zhome) {
        this.zuid = zuid;
        this.userid = userid;
        this.zstudent = zstudent;
        this.zmoney = zmoney;
        this.zmarriage = zmarriage;
        this.zchild = zchild;
        this.zhome = zhome;
    }

    public TUserzl() {
        super();
    }

    public Integer getZuid() {
        return zuid;
    }

    public void setZuid(Integer zuid) {
        this.zuid = zuid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getZstudent() {
        return zstudent;
    }

    public void setZstudent(String zstudent) {
        this.zstudent = zstudent;
    }

    public String getZmoney() {
        return zmoney;
    }

    public void setZmoney(String zmoney) {
        this.zmoney = zmoney;
    }

    public String getZmarriage() {
        return zmarriage;
    }

    public void setZmarriage(String zmarriage) {
        this.zmarriage = zmarriage;
    }

    public String getZchild() {
        return zchild;
    }

    public void setZchild(String zchild) {
        this.zchild = zchild;
    }

    public String getZhome() {
        return zhome;
    }

    public void setZhome(String zhome) {
        this.zhome = zhome;
    }
}