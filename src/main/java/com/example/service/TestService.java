package com.example.service;

import com.example.bean.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestService {
    int insert(Test record);

    List<Test> select(Test test);

    int deleteByIds(@Param("ids") Integer... ids);

    int update(Test test);

}
