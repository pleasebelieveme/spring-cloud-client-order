package com.spring_cloud.eureka.client.order;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;

@Component
public class OrderApplicationQueryDslConfig {
    @Bean
    JPAQueryFactory jpaQueryFactory(EntityManager em){
        return new JPAQueryFactory(em);
    }

}
