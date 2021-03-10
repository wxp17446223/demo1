package com.example;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.example.mapper")
@EnableTransactionManagement//开始事务管理
@EnableSwagger2 //开启Swagger
public class Demo1Application {
    public static void main(String[] args) {
//改端口 System.setProperty("server.port","80");
        SpringApplication.run(Demo1Application.class, args);

    }
}


