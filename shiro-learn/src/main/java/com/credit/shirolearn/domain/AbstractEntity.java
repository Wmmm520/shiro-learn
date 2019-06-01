package com.credit.shirolearn.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.credit.shirolearn.enums.DeleteFlagEnum;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Author: 王蒙Sanm
 * Date: 2019/6/1 15:31
 * Description: 基础类
 */
@Data
public abstract class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 204053287212469098L;

    /**
     * 记录创建者id
     */
    private String createdById;

    /**
     * 记录创建者用户名
     */
    private String creator;

    /**
     * 创建时间，禁止更改
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdTime;

    /**
     * 记录更新者id
     */
    @LastModifiedBy
    private String updatedById;

    /**
     * 记录更新者用户名
     */
    private String updater;

    /**
     * 最后更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedTime;

    /**
     * 版本号用于并发控制
     */
    @Version
    private int version = 0;

    /**
     * 逻辑删除
     */
    @TableLogic
    private String isDeleted = DeleteFlagEnum.UN_DELETED_FLAG.getStatus();
}
