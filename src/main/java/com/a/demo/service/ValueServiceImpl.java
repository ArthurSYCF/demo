package com.a.demo.service;

import com.a.demo.dao.ValueMapper;
import com.a.demo.model.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author Hu JinQuan
 * @Date 2018/11/12
 **/
@Service("valueService")
public class ValueServiceImpl implements ValueService {

    @Autowired
    ValueMapper valueMapper;

    @Override
    public Value getValue(String id) {
        return valueMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addValue(String v) {
        Value value = new Value();
        value.setValue(v);
        value.setIsDelete("1");
        value.setCreateTime(new Date());
        value.setUpdateTime(new Date());
        valueMapper.insert(value);
    }

    @Override
    public List<Value> getAllValues() {
        Value value = new Value();
        value.setIsDelete("1");
        return valueMapper.select(value);
    }

    @Override
    public void deleteValue(String id) {
        Value value = valueMapper.selectByPrimaryKey(id);
        if (null != value) {
            value.setIsDelete("0");
            value.setUpdateTime(new Date());
            valueMapper.updateByPrimaryKey(value);
        }
    }
}
