package org.example.dream_house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "org.example.dream_house.mapper")




public class DreamHouseApplication {

    public static void main(String[] args) {

        SpringApplication.run(DreamHouseApplication.class, args);
    }

}

