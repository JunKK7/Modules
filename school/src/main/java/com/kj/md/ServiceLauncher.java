package com.kj.md;

import java.util.Map;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@SpringBootApplication
@ComponentScan(basePackages = { "com.kj" })
@EnableCaching
public class ServiceLauncher
{
    static ConfigurableApplicationContext context = null;

    public static void main(String[] args)
    {
        //"spring.config.name:ovp-authentication",
        context = new SpringApplicationBuilder(ServiceLauncher.class)
            .properties("application").run(args);

        Map<String, WebMvcConfigurer> beans = context.getBeansOfType(WebMvcConfigurer.class, false, false);

        // CommonLoggers.DEBUG_LOGGER.info("RUN --> {}", context);
    }
}
