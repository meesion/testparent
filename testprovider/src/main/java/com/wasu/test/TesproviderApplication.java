package com.wasu.test;

import com.alibaba.boot.dubbo.EnableDubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboAutoConfiguration
public class TesproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesproviderApplication.class, args);
	}
}
