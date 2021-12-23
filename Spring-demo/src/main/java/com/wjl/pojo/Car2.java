package com.wjl.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//让bean实现InitializingBean初始化接口
//DisposableBean销毁接口
public class Car2 implements InitializingBean,DisposableBean{
	
	//销毁
	public void destroy() throws Exception {
		System.out.println("销毁");
	}
	//初始化
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化");
	}
	
}
