package com.hebn.lunchbot.infrastructure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Created by hebn on 2016-04-07.
 */
@Import(PersistenceInitializer.class)
@ComponentScan("com.hebn.lunchbot.application")
public class ServiceInitializer {
}
