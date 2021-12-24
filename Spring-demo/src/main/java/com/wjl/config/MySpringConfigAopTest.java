package com.wjl.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wjl.pojo.MyService;
import com.wjl.shiwu.UserService;

public class MySpringConfigAopTest {
	ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfigShiWu.class);
	
	private void forName(ApplicationContext app) {
		String[] names = app.getBeanDefinitionNames();
		for(String name:names) {
			System.out.println(name);
		}
	}
	
//	@Test
//	public void test1() {
//		MyService my = (MyService)app.getBean("mubiao");
//		int div = my.div(2, 2);
//		System.out.println(div);
//	}
	@Test
	public void test1() {
		forName(app);
	}
	
	
	
	@Test
	public void test2() {
		UserService user = app.getBean("userService",UserService.class);
		int insertOne = user.insertOne("王小明", 1);
		int i = 10/0;
		
		
	}
}
