package com.wjl.pojo;



//演示 一个类作为组件
public class Car {
	public Car() {
		System.out.println("被创建构造方法执行");
	}
	public void init() {
		System.out.println("初始化方法执行");
	}
	public void destroy() {
		System.out.println("销毁方法执行");
	}
}
