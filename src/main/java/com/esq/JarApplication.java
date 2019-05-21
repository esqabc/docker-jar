package com.esq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import java.util.Arrays;
/**
 * 系统启动类
 * @author esqabc
 * @Create 2019-11-11 11:11:11
 * @Website www.esqabc.com
 * @WeChat 110   
 */ 
@SpringBootApplication
public class JarApplication{

	public static void main(String[] args) {
		System.out.println("程序开始启动。。。。。。");
		long startTime = System.currentTimeMillis();    //获取开始时间
		SpringApplication.run(JarApplication.class, args);
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("程序启动成功。。。。。。");
		System.out.println("程序启动用时：" + (endTime - startTime) + "毫秒");//输出程序运行时间
		System.out.println("一共用时：" + (endTime - startTime)/60 + "秒");
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		
	   return args -> {
	       String[] beanNames = ctx.getBeanDefinitionNames();
	       Arrays.sort(beanNames);
	       Arrays.stream(beanNames).forEach(System.out::println);
	   };
	}	
	
}
