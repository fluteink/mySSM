package com.fluteink.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 明宇
 * @version 1.0
 */
@Configuration
//扫描组件
@ComponentScan("com.fluteink.controller")
public class WebConfig implements WebMvcConfigurer {

}
