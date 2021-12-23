package com.wjl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.wjl.pojo.Person;


@Configuration
//加载外部配置文件
@PropertySource(value="classpath:/Spring.properties")	
public class MySpringConfig {
	@Bean
	public Person getPerson() {
		return new Person();
	}
}
 