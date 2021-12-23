package com.wjl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wjl.SpringConfig3;
import com.wjl.SpringConfig4;
import com.wjl.SpringConfigueraTest;
import com.wjl.SpringSpringConfigueraTest2;
import com.wjl.pojo.Car;
import com.wjl.pojo.Car2;
import com.wjl.pojo.User;

public class SpringTest {
	
	@Test
	public void getName() {
		ApplicationContext context = //通过配置类获取对象
		new AnnotationConfigApplicationContext(SpringConfigueraTest.class);
		//获取容器中的所有组件名称
		String[] names = context.getBeanDefinitionNames();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	
	@Test
	public void getScope() {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringSpringConfigueraTest2.class);
		System.out.println("要获取了。。。。");
		User user = (User)context.getBean(User.class);		
		User user1 = (User)context.getBean(User.class);
		System.out.println(user==user1);
	}
	
	@Test
	public void osname() {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringSpringConfigueraTest2.class);
		String[] names = context.getBeanDefinitionNames();
		for(String name:names) {
			System.out.println(name);
		}
	}
	
	@Test
	public void import1() {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig3.class);
		String[] names = context.getBeanDefinitionNames();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	
	@Test
	public void getUser() {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig3.class);
		User user = context.getBean("userBean",User.class);
		User user1 = context.getBean("userBean",User.class);
		System.out.println(user==user1);
	}
	
	@Test
	public void getCar() {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig4.class);
		Car2 car2 = context.getBean("car2",Car2.class);
		System.out.println(car2);
	}
}
