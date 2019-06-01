package com.credit.shirolearn.enums;


import lombok.Getter;

/**
 * * @Author: 王旻烺Sanm
 * * @Date: 2018/10/19 14:04
 * * @Description: 请求枚举类
 **/
@Getter
public enum HttpStatusEnum {

    SUCCESS_REQUEST("0000","请求成功"),
    FAIL_RESPONSE("1111","请求失败"),
    TOKEN_INVALID("401","token不合法"),
    REQUEST_METHOD_ERROR("1000","请求方式错误"),
    ;

    private String status;

    private String message;

    HttpStatusEnum(String status, String message){
        this.status = status;
        this.message = message;
    }

}
