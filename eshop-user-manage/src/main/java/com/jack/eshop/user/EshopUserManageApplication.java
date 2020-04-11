package com.jack.eshop.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jack.eshop.user.mapper")
public class EshopUserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopUserManageApplication.class, args);
    }

}
