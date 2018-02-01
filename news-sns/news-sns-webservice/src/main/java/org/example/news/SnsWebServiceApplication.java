package org.example.news;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication(scanBasePackages = "org.example.news")
//@EnableEurekaClient
@EnableCircuitBreaker
@MapperScan("org.example.news.sns.common.dao.impl.mapper")
public class SnsWebServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SnsWebServiceApplication.class, args);
    }
}
