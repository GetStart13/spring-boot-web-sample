package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * SpringBoot 全局配置跨域
 * <p>
 * <p>- 默认情况下，请求不可跨域
 * <p>- {@link WebMvcConfigurer#addCorsMappings(CorsRegistry)} 添加的配置按由上到下顺序匹配，重复添加的 pathPattern 会覆盖
 * <p>- {@link WebMvcConfigurer#addCorsMappings(CorsRegistry)} 添加的配置与 Controller 级别的配置可以叠加
 */
@Configuration
public class CORSConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 禁止指定 URL 跨域
        registry.addMapping("/specific-url/**").allowedOrigins();
        // 允许所有 URL 跨域
        registry.addMapping("/**").allowedOrigins("*");
    }
}
