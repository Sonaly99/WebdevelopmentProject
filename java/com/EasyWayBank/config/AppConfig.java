package com.EasyWayBank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = {"com.EasyWayBank"})
public class AppConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("css/**","images/**", "js/**")
                .addResourceLocations("classpath:/static/css/", "classpath:/static/css/images/", "classpath:/static/css/js/");
    }

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
            InternalResourceViewResolver jspViewResolver = new InternalResourceViewResolver();
            jspViewResolver.setPrefix("/WEB-INF/jsp/");
            jspViewResolver.setSuffix(".jsp");
            jspViewResolver.setViewClass(JstlView.class);

            return jspViewResolver;

        }
    }