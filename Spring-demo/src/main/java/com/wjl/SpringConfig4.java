package com.wjl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wjl.config.MyBeanPostProcessor;
import com.wjl.pojo.Car;
import com.wjl.pojo.Car2;

@Configuration
public class SpringConfig4 {
	/**
	 * @Bean的参数指定该类的方法为什么方法
	 * initMethod 指定类中的方法为初始化方法
	 * 	单实例
	 * 		初始化：对象创建完成并且赋值好
	 * 	多实例
	 * 		初始化：在需要调用对象时执行
	 * 
	 * destroyMethod 为销毁时执行的方法
	 * 	单实例
	 * 		IOC容器关闭时
	 * 	多实例
	 * 		容器不会调用，需要手动
	 * 		
	 */	
	@Bean(name="car",initMethod="init",destroyMethod="destroy")
	public Car getCar() {
		return new Car();
	}
	/**
	 * 让bean实现InitializingBean初始化接口
	 * DisposableBean销毁接口
	 */
	@Bean("car2")
	public Car2 getCar2() {
		return new Car2();
	}
	/**
	 * 以JSR250方式实现
	 * @PostConstruct:在Bean创建完成并且属性赋值完成，来实现初始化方法
	 * @PreDestory:在容器销毁Bean之前通知我们进行清理工作
	 */
	
	
	@Bean
	public MyBeanPostProcessor getBeanPost() {
		return new MyBeanPostProcessor();
	}
}
