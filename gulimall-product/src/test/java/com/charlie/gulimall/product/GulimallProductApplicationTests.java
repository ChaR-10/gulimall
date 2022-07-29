package com.charlie.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.charlie.gulimall.product.entity.BrandEntity;
import com.charlie.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=GulimallProductApplication.class)
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("hello world");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1l));
        List<BrandEntity> list = brandService.list();
        list.forEach((item) ->{
            System.out.println(item);
        });

    }


//    @Test
//    void contextLoads() {
//    }

}
