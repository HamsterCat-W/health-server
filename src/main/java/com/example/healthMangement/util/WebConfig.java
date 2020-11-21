package com.example.healthMangement.util;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//跨域请求配置
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //允许跨域的东西 /**表示都允许
        registry.addMapping("/**")
                //跨域来源 http://localhost:8080 注意端口
                .allowedOrigins("http://localhost:8080", "null")
                //允许跨域方法
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                //最大响应时间
                .maxAge(3600)
                //允许携带
                .allowCredentials(true);
    }
}
