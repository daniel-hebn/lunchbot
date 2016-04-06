package com.hebn.lunchbot.infrastructure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by hebn on 2016-04-07.
 */
@Import(ServiceInitializer.class)
@EnableWebMvc
@Configuration
@ComponentScan("com.hebn.lunchbot.interfaces")
public class ServletInitializer extends WebMvcConfigurerAdapter {


}
