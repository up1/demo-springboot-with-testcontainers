package com.example.demo_testcontainer;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
class MongoDBConfig {

    @Bean
    @ServiceConnection
    public MongoDBContainer createTestContainer() {
        return new MongoDBContainer(DockerImageName.parse("mongo"));
    }
}
