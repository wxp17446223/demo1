package com.example.controller;

import com.example.bean.Test;
import com.example.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping(value = "/test")
    public List<Test> findAll(Test test) {
        System.out.println("test = " + test);
        return testService.select(test);
    }

    @GetMapping(value = "/insert")
    public int insert(Test test) {
        return testService.insert(test);
    }

    @GetMapping(value = "/del")
    public int deleteByIds(Integer... ids) {
        return testService.deleteByIds(ids);
    }

    @GetMapping(value = "/update")
    public int update(Test test) {
        return testService.update(test);
    }
}
