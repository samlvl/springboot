package com.gcl.web.springbootconsumers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages={"com.gcl"}) // 扫描该包路径下的所有spring组件
@EnableTransactionManagement // 开启注解事务管理
@EnableJpaRepositories("org.spring.springboot.baseInter")
@EntityScan("org.spring.springboot.domain")
@SpringBootApplication
@PropertySource("classpath:common.properties")
public class App
{
	 public static void main(String[] args) {  
	        SpringApplication.run(App.class, args);       
	    }  
}