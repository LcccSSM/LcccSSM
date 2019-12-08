package com.ssm.model;

import lombok.ToString;

@ToString
public class SysDict {
    private Long did;

    private String dtitle;

    private String dtype;

    private String dcontent;

    private Integer dstate;

    public SysDict(Long did, String dtitle, String dtype, String dcontent, Integer dstate) {
        this.did = did;
        this.dtitle = dtitle;
        this.dtype = dtype;
        this.dcontent = dcontent;
        this.dstate = dstate;
    }

    public SysDict() {
        super();
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDtitle() {
        return dtitle;
    }

    public void setDtitle(String dtitle) {
        this.dtitle = dtitle;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getDcontent() {
        return dcontent;
    }

    public void setDcontent(String dcontent) {
        this.dcontent = dcontent;
    }

    public Integer getDstate() {
        return dstate;
    }

    public void setDstate(Integer dstate) {
        this.dstate = dstate;
    }
}