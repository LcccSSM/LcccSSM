package com.ssm.dto;

import com.ssm.model.Tuser;
import lombok.ToString;

@ToString
public class MyYZM{
    private int yzm;

    public int getYzm() {
        return yzm;
    }

    public void setYzm(int yzm) {
        this.yzm = yzm;
    }
}
