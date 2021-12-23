package com.wjl.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class Conditionimpl implements Condition{
	/**
	 * ConditionContext 判断条件的条件上下文【环境】
	 * AnnotatedTypeMetadata  注释信息
	 */
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//常用方法
		//获取到IOC当前使用的BeanFactory
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		//获取类加载器
		ClassLoader loader = context.getClassLoader();
		//获取当前环境信息
		Environment eomt = context.getEnvironment();
		//获取到所有bean的注册类 也可以【增删改】
		BeanDefinitionRegistry registry = context.getRegistry();
		
		//通过当前环境信息 获取当前操作系统名称
		String os = eomt.getProperty("os.name");
		System.out.println(os);
		//判断包含windows 包含的话就可以创建bill实例对象
		if(os.contains("Windows")) {
			return true;
		}
		return false;
	}
}
