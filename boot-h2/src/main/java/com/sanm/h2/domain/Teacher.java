package com.sanm.h2.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/28 09:02
 * Description:
 */
@Data
@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(length = 50, unique = true, nullable = false)
    private String name;

    @JsonIgnore
    @NotNull
    @Size(min = 60, max = 60)
    @Column(name = "account", length = 60)
    private String account;

    @Size(max = 50)
    @Column(name = "password", length = 50)
    private String password;
}
