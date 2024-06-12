package org.example.dream_house;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

@MapperScan(value = "org.example.dream_house.mapper")
class DreamHouseApplicationTests {

    @Test
    void contextLoads() {
    }

}
