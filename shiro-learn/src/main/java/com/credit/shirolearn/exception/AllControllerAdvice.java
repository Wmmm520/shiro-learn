package com.credit.shirolearn.exception;

import com.credit.shirolearn.enums.HttpStatusEnum;
import com.credit.shirolearn.model.ResponseHelper;
import com.credit.shirolearn.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * * @Author: 王旻烺Sanm
 * * @Date: 2018/11/19 13:55
 * * @Description: 全局异常拦截
 **/
@ControllerAdvice
@ResponseBody
public class AllControllerAdvice {

    //请求方法不正确
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<ResponseModel> httpRequestMethodHandler() {
        return ResponseHelper.error(HttpStatusEnum.REQUEST_METHOD_ERROR);
    }

    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ResponseModel> requestErrorHandler(CustomException e) {
        return ResponseHelper.errorException(e.getMessage(), e.getStatus());
    }

}
