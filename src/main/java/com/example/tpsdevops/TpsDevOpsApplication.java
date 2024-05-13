package com.example.tpsdevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpsDevOpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpsDevOpsApplication.class, args);
        System.out.println("Tps DevOps: Jenkins");
        System.out.println("*".repeat(20));
    }

}
