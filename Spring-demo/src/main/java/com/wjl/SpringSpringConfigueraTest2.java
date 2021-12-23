package com.wjl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.wjl.config.Conditionimpl;
import com.wjl.pojo.User;

//@Configuration
//@ComponentScan("com.wjl")
public class SpringSpringConfigueraTest2 {
	/**
	 * @Scope的参数
	 * "prototype" 多实例 在IOC容器启动时不创建 当中每次请求这个组件都会创建一次这个组件
	 * "singleton" 单实例 在IOC启动就创建一个 请求组件都是这一个【默认就是这个】
	 * "request" 同一次请求创建一个实例
	 * "session" 同一个Session创建一个实例
	 * 
	 *	懒加载： 在容器创建时不创建【单实例】组件 在第一次请求时创建
	 *	@Lazy 懒加载注解 被标注的组件会懒	
	 */
	//@Scope("prototype")
	//@Lazy
	//@Bean
	public User getUser() {
		System.out.println("IOC创建完成");
		return new User("zhangsan","123456");
	}
	
	
	/**
	 * 根据条件创建对象【@Conditional】
	 * Class<? extends Condition>[] value();
	 * 所以 创建实现类作为条件
	 * @return
	 */
	//@Conditional(value= {Conditionimpl.class})
	//@Bean("bill")
	public User getbill() {
		return new User();
	}
	//@Conditional(value = { null })
	//@Bean("linus")
	public User getlinus() {
		return new User();
	}
	
}
