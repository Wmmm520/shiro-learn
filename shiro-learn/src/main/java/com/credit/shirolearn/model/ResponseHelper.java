package com.credit.shirolearn.model;

import com.credit.shirolearn.enums.HttpStatusEnum;
import org.springframework.http.ResponseEntity;

/**
 * * @Author: Sanm
 * * @Date: 2018/12/19 11:20
 * * @Description: 请求返回实体方法封装
 **/
public class ResponseHelper {

    public ResponseHelper() {
    }

    public static ResponseEntity<ResponseModel> error(HttpStatusEnum httpStatusEnum) {
        ResponseModel response = new ResponseModel();
        response.setStatus(httpStatusEnum.getStatus());
        response.setMessage(httpStatusEnum.getMessage());
        return ResponseEntity.ok().body(response);
    }

    public static ResponseEntity<ResponseModel> errorException(String message, String status) {
        ResponseModel response = new ResponseModel();
        response.setStatus(status);
        response.setMessage(message);
        return ResponseEntity.ok().body(response);
    }


    public static <T> ResponseEntity<ResponseModel<T>> success(T result) {
        ResponseModel response = new ResponseModel();
        response.setStatus(HttpStatusEnum.SUCCESS_REQUEST.getStatus());
        response.setMessage(HttpStatusEnum.SUCCESS_REQUEST.getMessage());
        response.setResult(result);
        return ResponseEntity.ok().body(response);
    }

    public static ResponseEntity<ResponseModel> success() {
        ResponseModel response = new ResponseModel();
        response.setStatus(HttpStatusEnum.SUCCESS_REQUEST.getStatus());
        response.setMessage(HttpStatusEnum.SUCCESS_REQUEST.getMessage());
        response.setResult(null);
        return ResponseEntity.ok().body(response);
    }

}
