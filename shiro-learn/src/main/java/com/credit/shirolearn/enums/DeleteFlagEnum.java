package com.credit.shirolearn.enums;

import lombok.Getter;

/**
 * Author: 王蒙Sanm
 * Date: 2019/6/1 15:43
 * Description: 邏輯刪除枚举
 */
@Getter
public enum DeleteFlagEnum {

    DELETED_FLAG("1", "逻辑删除"),
    UN_DELETED_FLAG("0", "banner");

    private String status;

    private String message;

    DeleteFlagEnum(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
