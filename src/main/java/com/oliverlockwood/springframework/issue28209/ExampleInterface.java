package com.oliverlockwood.springframework.issue28209;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;


public interface ExampleInterface {

    @Retryable(backoff = @Backoff(delay = 1000, maxDelay = 10000, multiplier = 2), maxAttempts = 5)
    void doSomething(String param);

}
