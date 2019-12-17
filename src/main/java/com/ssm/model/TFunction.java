package com.ssm.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class TFunction {
    private Integer functionId;

    private String functionName;

    private String path;

    private String method;

    private List<TFunction> children = new ArrayList<>();//存储子节点的内容

    public TFunction(Integer functionId, String functionName, String path, String method) {
        this.functionId = functionId;
        this.functionName = functionName;
        this.path = path;
        this.method = method;
    }

    public TFunction() {
        super();
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<TFunction> getChildren() {
        return children;
    }

    public void setChildren(List<TFunction> children) {
        this.children = children;
    }
}