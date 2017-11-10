package com.wasu.test;

import com.alibaba.boot.dubbo.EnableDubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboAutoConfiguration
public class TestconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestconsumerApplication.class, args);
	}
}
