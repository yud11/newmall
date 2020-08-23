package com.yudi.mall.product;

import com.yudi.mall.product.entity.PmsBrandEntity;
import com.yudi.mall.product.service.PmsBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {


    @Autowired
    PmsBrandService pmsBrandService;

    @Test
    void contextLoads() {
        PmsBrandEntity entity =  new PmsBrandEntity();
        entity.setName("xiaomi");
        pmsBrandService.save(entity);
    }

}
