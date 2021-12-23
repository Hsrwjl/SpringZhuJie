package com.wjl.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
	/**
	 * 两个方法的两个参数
	 * Object bean 表示创建还没/已经初始化的对象的实例
	 * String beanName 名字
	 */

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化之前的"+beanName+bean);
		return bean;
		
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化之前后"+beanName+bean);
		return bean;
		
	}
	/*
	输出：processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
	被创建构造方法执行
	初始化之前的carcom.wjl.pojo.Car@543588e6
	初始化方法执行
	初始化之前后carcom.wjl.pojo.Car@543588e6
	初始化之前的car2com.wjl.pojo.Car2@58d75e99
	初始化
	初始化之前后car2com.wjl.pojo.Car2@58d75e99
	com.wjl.pojo.Car2@58d75e99
	*/
}
