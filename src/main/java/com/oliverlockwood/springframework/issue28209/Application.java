package com.oliverlockwood.springframework.issue28209;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.retry.annotation.EnableRetry;


@EnableRetry
@SpringBootApplication(scanBasePackages = "com.oliverlockwood")
@EnableConfigurationProperties
@Slf4j
public class Application extends SpringApplication {

    public static void main(String[] args) {

        log.info("Starting example service");
        Application.run(Application.class, args);
        log.info("Example service is running...");
    }

}
