package com.gcl.web.springbootconsumers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.gcl"}) // 扫描该包路径下的所有spring组件
@SpringBootApplication
public class App
{
	 public static void main(String[] args) {  
	        SpringApplication.run(App.class, args);       
	    }  
}