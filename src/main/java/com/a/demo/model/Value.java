package com.a.demo.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hu JinQuan
 * @Date 2018/11/12
 **/

@Data
public class Value implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT CONCAT(date_format(NOW(), '%Y%m%d%H%i%s'),REPLACE (UUID(), '-', ''))")
    private String id;
    private String value;
    private String isDelete;
    private Date createTime;
    private Date updateTime;
}
