package com.a.demo.service;

import com.a.demo.model.Value;

import java.util.List;

/**
 * @Author Hu JinQuan
 * @Date 2018/11/12
 **/

public interface ValueService {

    Value getValue(String id);

    void addValue(String value);

    List<Value> getAllValues();

    void deleteValue(String id);
}
