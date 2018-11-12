package com.a.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * mybatis配置
 *
 * @author HJH
 * @since 2017-08-09
 **/
@Configuration
public class MybatisConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.a.demo.dao");
        mapperScannerConfigurer.setMarkerInterface(Mapper.class);
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        Properties properties = new Properties();
        properties.setProperty("ORDER", "BEFORE");
        properties.setProperty("keyProperty", "id");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }

}
