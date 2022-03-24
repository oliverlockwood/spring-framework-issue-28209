package com.oliverlockwood.springframework.issue28209;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * This class provides contains default implementations of interfaces
 */

@Slf4j
@Configuration
public class DefaultConfiguration {

    @ConditionalOnMissingBean(ExampleInterface.class)
    @Bean
    public ExampleInterface defaultExampleInterfaceImplementation() {

        // If this was used instead of the lambda below, the application would work OK.
        // This is the essence of the bug.
//        return new ExampleInterface() {
//            @Override
//            public void doSomething(String param) {
//                log.info("I did something");
//            }
//        };

        return param -> log.info("I did something");
    }

}
