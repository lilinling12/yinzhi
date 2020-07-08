package com.lilinling.yinzhi.makers;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合MyBatis-Plus
 *      1)、导入依赖
 *      2）、配置
 *          1、配置数据源
 *              1）、导入数据驱动
 *              2）、在application.yml配置数据源相关信息
 *          2、配置MyBatis-Plus
 *              1）、使用MapperScan
 *              2）、告诉MyBatis-Plus，sql映射文件位置
 */
@MapperScan("com.lilinling.yinzhi.makers.dao")
@SpringBootApplication
public class YinzhiMakersApplication {

    public static void main(String[] args) {
        SpringApplication.run(YinzhiMakersApplication.class, args);
    }

}
