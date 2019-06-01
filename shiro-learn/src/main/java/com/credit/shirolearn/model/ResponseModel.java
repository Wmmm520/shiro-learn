package com.credit.shirolearn.model;


import java.io.Serializable;

/**
 * * @Author: 王旻烺Sanm
 * * @Date: 2018/10/19 11:19
 * * @Description: 返回实体封装
 **/
public class ResponseModel<T> implements Serializable {

    private static final long serialVersionUID = -1241360949457314497L;

    private String status;
    private T result;
    private String message;

    public ResponseModel(String status, T result, String message) {
        this.status = status;
        this.result = result;
        this.message = message;
    }

    public ResponseModel() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
