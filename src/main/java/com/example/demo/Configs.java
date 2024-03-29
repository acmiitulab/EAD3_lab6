package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


@Configuration
@ComponentScan("com.example.demo")
@PropertySource("/application.properties")
@EnableJpaRepositories(basePackages = "com.example.demo")
public class Configs {
    @Bean
    public Scanner getScannerBean() {
        return new Scanner(System.in);
    }

    @Bean
    public BufferedReader getBufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

}
