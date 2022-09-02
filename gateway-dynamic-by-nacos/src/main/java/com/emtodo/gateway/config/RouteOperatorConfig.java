package com.emtodo.gateway.config;

import com.emtodo.gateway.service.RouteOperator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cloud.gateway.route.RouteDefinitionWriter;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类：将实例化后的RouteOperator注册到spring环境中
 *
 * @author em
 */
@Configuration
public class RouteOperatorConfig {
    @Bean
    public RouteOperator routeOperator(ObjectMapper objectMapper,
                                       RouteDefinitionWriter routeDefinitionWriter,
                                       ApplicationEventPublisher applicationEventPublisher) {

        return new RouteOperator(objectMapper,
                routeDefinitionWriter,
                applicationEventPublisher);
    }
}
