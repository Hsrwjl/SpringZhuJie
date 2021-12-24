package com.wjl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


import com.wjl.pojo.MyService;


/**
 * 将切面类和目标方法都加入到容器当中
 */
@Configuration
//必须在配置类上加入该注解才能开启AOP
@EnableAspectJAutoProxy
public class MySpringConfigAop {
	
	@Bean("mubiao")//目标类
	public MyService getMyService() {
		return new MyService();
	}
	
	@Bean("qiemian")//切面类
	public ServiceLog getServiceLog() {
		return new ServiceLog();
	}
}
