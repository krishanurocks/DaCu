package com.datacloud.DaCu;

import java.util.logging.Logger;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer  {
    private static final String MODULE = "[ServletInitializer] ";
    private static final Logger logger = Logger.getLogger(ServletInitializer.class.getName());

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        logger.info(MODULE + " In method configure()");
        logger.info(MODULE + " TestBoot Base Class Initializing!");
        return application.sources(DaCuApplication.class);
    }
}
