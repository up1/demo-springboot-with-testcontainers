package com.example.demo_testcontainer;

import org.springframework.boot.SpringApplication;

public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.from(DemoTestcontainerApplication::main)
                .with(MongoDBConfig.class).run(args);
    }

}
