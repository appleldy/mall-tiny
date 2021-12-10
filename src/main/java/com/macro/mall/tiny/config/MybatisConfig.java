package com.macro.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ldy
 * @create 2021/12/10 10:21 AM
 */
@Configuration
@MapperScan("com.macro.mall.tiny.mbg.mapper")
public class MybatisConfig {
}
