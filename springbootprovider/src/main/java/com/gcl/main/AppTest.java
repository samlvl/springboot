package com.gcl.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
@ComponentScan(basePackages={"com.gcl"}) // 扫描该包路径下的所有spring组件
@SpringBootApplication
@PropertySource("classpath:common.properties")
public class AppTest 
{
	 public static void main(String[] args) {  
	        SpringApplication.run(AppTest.class, args);       
	    }  
}