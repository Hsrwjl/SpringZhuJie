package com.wjl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.wjl.config.FilterPackConfigurstion;
import com.wjl.pojo.User;

//指定该类为注解类
//@Configuration
//注解扫描 可以指定为数组或者但字符串的文件夹
//basePackages/value 表示要扫描的包
//includeFilters=@Filter指定排除的组件
//excludeFilters=@Filter指定只需要包含的组件
//@ComponentScan(value={"com.wjl","com.wjl"},
//type指定扫描什么（类/被注解标注的类） //classes表示明确的类
		//FilterType.ANNOTATION 指定被什么注解标注的类
		//FilterType.ASSIGNABLE_TYPE 指定什么类被扫描
		//FilterType.REGEX //正则表达式
		//FilterType.CUSTOM自定义规则
//useDefaultFilters=false 表示将默认的扫描包机制取消 自定义的才会生效
//   includeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE,classes= {UserDao.class}),
//   excludeFilters=@Filter(type=FilterType.ANNOTATION,classes= {Service.class}),
//	excludeFilters = @Filter(type=FilterType.CUSTOM,classes= {FilterPackConfigurstion.class}),
//   useDefaultFilters = false)
//@ComponentScans() 里面可以放置多个@ComponentScan配置
public class SpringConfigueraTest {
	
	//@Bean标注于方法之上，表示将返回的类型放在作为组件放在容器中
	//与Configuration搭配使用 组件的默认名字为方法名 可以自定义名字
	//注意 起别名不要与其他组件同样引起冲突
	//@Bean(name = "zhangsan")
	public User getUser() {
		return new User("张三","123456");
	}
	
}
