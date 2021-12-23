package com.wjl.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.wjl.pojo.User;
//将这个类放置于@Import注解中    //实现ImportBeanDefinitionRegistrar接口
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{
	/**
	 * AnnotationMetadata:当前类的注册信息
	 * BeanDefinitionRegistry：
	 * 		BeanDefinition 的注册类 把所需要添加到容器中的注册类
	 * 		用registry.registerBeanDefinition("zhangsan", bean);
	 * 		方法注册
	 */
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO 自动生成的方法存根
		//判断当前容器中的注册信息是否包含Pig
		Boolean pig = registry.containsBeanDefinition("com.wjl.pojo.Pig");
		if (pig) {
			//注册bean 并为其指定名称
			RootBeanDefinition bean = new RootBeanDefinition(User.class);
			registry.registerBeanDefinition("zhangsan", bean);
		}
	}
}
