package com.example.service.impl;

import com.example.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.example.bean.Test;
import com.example.mapper.TestMapper;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public int insert(Test record) {
        return testMapper.insert(record);
    }

    @Override
    public List<Test> select(Test test) {
        return testMapper.select(test);
    }

    @Override
    public int deleteByIds(Integer... ids) {
        return testMapper.deleteByIds(ids);
    }

    @Override
    public int update(Test test) {
        return testMapper.update(test);
    }

}
