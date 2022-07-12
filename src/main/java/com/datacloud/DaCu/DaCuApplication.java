package com.datacloud.DaCu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.datacloud.DaCu" })
public class DaCuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaCuApplication.class, args);
	}

}
