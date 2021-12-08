package com.powerengineering.examinationsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.powerengineering.examinationsystem.dao")
public class ExaminationsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExaminationsystemApplication.class, args);
    }

}
