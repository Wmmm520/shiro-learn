package com.credit.shirolearn.exception;

import com.credit.enums.HttpStatusEnum;

/**
 * * @Author: 王旻烺Sanm
 * * @Date: 2018/10/19 14:01
 * * @Description: 自定义异常
 **/
public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 3455708526465670030L;

    private String status;

    public CustomException(String msg,String status){
        super(msg);
        this.status = status;
    }

    public CustomException(HttpStatusEnum httpStatusEnum){
        super(httpStatusEnum.getMessage());
        this.status = httpStatusEnum.getStatus();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
