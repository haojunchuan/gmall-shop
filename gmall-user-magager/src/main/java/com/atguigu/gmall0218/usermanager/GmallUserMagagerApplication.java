package com.atguigu.gmall0218.usermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall0218.usermanager")
public class GmallUserMagagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserMagagerApplication.class, args);
    }

}
