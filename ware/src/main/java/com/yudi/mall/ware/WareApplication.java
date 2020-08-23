package com.yudi.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yudi.mall.ware.dao")
@SpringBootApplication
public class WareApplication {

    public static void main(String[] args) {
        SpringApplication.run(WareApplication.class, args);
    }

}
