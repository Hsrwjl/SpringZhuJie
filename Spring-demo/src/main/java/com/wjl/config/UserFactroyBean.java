package com.wjl.config;

import org.springframework.beans.factory.FactoryBean;

import com.wjl.pojo.User;
//FactoryBean接口 指定泛型为User 此时就是User工厂  产出User
public class UserFactroyBean implements FactoryBean<User>{
	//返回的类型添加到组件
	public User getObject() throws Exception {
		return new User();
	}
	//指定返回的类型
	public Class<?> getObjectType() {
		return User.class;
	}
	//控制单实例（true）
	public boolean isSingleton() {
		return false;
	}
}
