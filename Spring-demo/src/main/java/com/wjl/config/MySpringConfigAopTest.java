package com.wjl.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wjl.pojo.MyService;

public class MySpringConfigAopTest {
	ApplicationContext app = new AnnotationConfigApplicationContext(MySpringConfigAop.class);
	@SuppressWarnings("unused")
	private void forName(ApplicationContext app) {
		String[] names = app.getBeanDefinitionNames();
		for(String name:names) {
			System.out.println(name);
		}
	}
	
	@Test
	public void test1() {
		MyService my = (MyService)app.getBean("mubiao");
		int div = my.div(2, 2);
		System.out.println(div);
	}
}
