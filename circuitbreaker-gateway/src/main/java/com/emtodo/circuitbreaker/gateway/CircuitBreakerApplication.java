package com.emtodo.circuitbreaker.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * CircuitBreaker 启动类
 * <p>
 *     断路器功能网关
 * </p>
 *
 * @author em
 */
@SpringBootApplication
public class CircuitBreakerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakerApplication.class,args);
    }
}
