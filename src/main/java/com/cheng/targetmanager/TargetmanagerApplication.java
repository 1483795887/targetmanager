package com.cheng.targetmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cheng.targetmanager.mapper")
@SpringBootApplication
public class TargetmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TargetmanagerApplication.class, args);
    }

}
