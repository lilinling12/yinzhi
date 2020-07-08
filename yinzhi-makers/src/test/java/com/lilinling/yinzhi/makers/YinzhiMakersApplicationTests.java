package com.lilinling.yinzhi.makers;

import com.lilinling.yinzhi.makers.entity.AttrEntity;
import com.lilinling.yinzhi.makers.service.AttrService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YinzhiMakersApplicationTests {

    @Autowired
    AttrService attrService;

    @Test
    void contextLoads() {
//
//        AttrEntity attrEntity = new AttrEntity();
//
//        attrEntity.setAttrName("zhong");
//        attrService.save(attrEntity);
//        System.out.println("保存成功......");
    }

}
