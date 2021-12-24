package com.wjl.aop;
1111111
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 通知方法
 * 	- 前置通知	@Before
 * 	- 后置通知	@After
 * 	- 返回通知	@AfterReturning
 * 	- 异常通知	@AfterThrowing
 * 	- 环绕通知	@Around
 * 
 * 切入表达式：execution()
 * 	- (..) 表示任意参数
 * 	- * 表示此类所有方法
 * @Aspect 
 * 	放置于切面类上告诉Spring哪一个是切面类
 * 
 * //必须在配置类上加入该注解才能开启AOP
 * @EnableAspectJAutoProxy
 * 
 * 获取目标方法的一些方式
 * JoinPoint  join
 * 	- join.getSignature() 获取方法签名
 * 	- join.getArys() 获取参数
 * 	- jion.getTarget() 拿取对象
 * 	- 注意这个类型的参数必须出现在方法参数的第一位，不然无效
 */
//业务层的aop切面
@Aspect
public class ServiceLog {
	//抽取公共的切入点
	@Pointcut("execution(public int com.wjl.pojo.MyService.*(..))")
	public void pointcut() {}
	
	//@Before("execution(public int com.wjl.pojo.MyService.div(int ,int))"")
	@Before("execution(public int com.wjl.pojo.MyService.div(int,int))")
	public void initLog(JoinPoint jion) {
		System.out.println(jion.getSignature()+"除法开始了"+"参数是"+Arrays.asList(jion.getArgs()));
	}
	
	@After("pointcut()")//直接引用
	public void destroyLog() {
		System.out.println("除法结束");
	}
	
	@AfterReturning(value = "pointcut()",returning="re")
	public void returnLog(Object re) {
		System.out.println("返回结果是：{"+re+"}");
	}
	
	@AfterThrowing(value="pointcut()",throwing="exc")
	public void excptionLog(Exception exc) {
		System.out.println("异常是：{"+exc.getMessage()+"}");
	}
	
	@Around(value="pointcut()")
	public void kaiShiAndJieshu(ProceedingJoinPoint point) {
		System.out.println("环绕之前");
		try {
			point.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("环绕之后");
	}
}
