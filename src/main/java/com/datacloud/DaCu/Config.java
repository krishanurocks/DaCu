package com.datacloud.DaCu;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
public class Config {
    private static String MODULE = "[Config] ";
    private static final Logger logger = Logger.getLogger(Config.class.getName());

    @Autowired
    ApplicationContext applicationContext;

    @Bean
    public SpringResourceTemplateResolver springResourceTemplateResolver() {
        logger.info(MODULE + " In method springResourceTemplateResolver()");
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/views/");
        templateResolver.setSuffix(".html");
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine springTemplateEngine() {
        logger.info(MODULE + " In method springTemplateEngine()");
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(springResourceTemplateResolver());
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    @Bean
    public ViewResolver viewResolver() {
        logger.info(MODULE + " In method viewResolver()");
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(springTemplateEngine());
        viewResolver.setOrder(0);
        return viewResolver;
    }
}
