package com.example.controller;

import com.example.bean.Test;
import com.example.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping()
    public List<Test> getTest(Test test) {
        System.out.println("test = " + test);
        return testService.select(test);
    }
}
