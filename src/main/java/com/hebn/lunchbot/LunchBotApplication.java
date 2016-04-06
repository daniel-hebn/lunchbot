package com.hebn.lunchbot;

import com.hebn.lunchbot.infrastructure.WebInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

@Import(WebInitializer.class)
@Configuration
@EnableAutoConfiguration
public class LunchBotApplication {

	private static final Logger log = LoggerFactory.getLogger(LunchBotApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(LunchBotApplication.class).run(args);
		log.info("Spring Boot Started - profile : {} , {}",
				Arrays.toString(context.getEnvironment().getDefaultProfiles()),
				Arrays.toString(context.getEnvironment().getActiveProfiles()));
	}
}
