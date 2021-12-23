package com.wjl.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//自定@Import导入的类
//实现ImportSelector接口
public class MyImport implements ImportSelector{
	//在这个方法中返回值的全类名就是导入的类
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//可以是空数组 不能为null
		return new String[] {"com.wjl.pojo.Pig"};
	}
}
