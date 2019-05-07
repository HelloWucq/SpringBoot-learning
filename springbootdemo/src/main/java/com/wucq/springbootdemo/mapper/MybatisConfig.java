package com.wucq.springbootdemo.mapper;

import java.util.Properties;

import com.github.pagehelper.PageHelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatisConfig
 */
@Configuration
public class MybatisConfig {
    private static final Logger logger=LoggerFactory.getLogger(MybatisConfig.class);

    @Bean
    public PageHelper pageHelper() {
        logger.info("注册Mybatis分页插件PageHelper");
        PageHelper pageHelper=new PageHelper();
        Properties p=new Properties();
        p.setProperty("offsetAsPageNum","true");
        p.setProperty("rowBoundsWithCount","true");
        p.setProperty("resonable","true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}