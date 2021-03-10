package com.example.mapper;

import com.example.bean.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {
    int insert(Test record);

    List<Test> select(Test test);

    int deleteByIds(@Param("ids") Integer... ids);

    int update(Test test);
}