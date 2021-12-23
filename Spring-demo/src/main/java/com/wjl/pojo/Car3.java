package com.wjl.pojo;

public class Car3 {

	public Car3() {
		System.out.println("构造赋值完成");
	}
	//PS：JDK版本9之后过时
	//@PostConstruct
	public void init() {
		System.out.println("初始化");
	}
	
	//@PreDestory
	public void destdory() {
		System.out.println("销毁方法");
	}
}
