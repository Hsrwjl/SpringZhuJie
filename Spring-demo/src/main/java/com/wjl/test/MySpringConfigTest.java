package com.wjl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.wjl.MySpringConfig;
import com.wjl.pojo.Person;

public class MySpringConfigTest {
	
	private AnnotationConfigApplicationContext app = 
			new AnnotationConfigApplicationContext(MySpringConfig.class);
	
	private void forName(ApplicationContext app) {
		String[] names = app.getBeanDefinitionNames();
		for(String name:names) {
			System.out.println(name);
		}
	}
	
	@Test
	public void test1() {
		Person p = app.getBean("getPerson",Person.class);
		System.out.println(p);
		//Person [name=张三, age=2]
	}
	
	
	
}
