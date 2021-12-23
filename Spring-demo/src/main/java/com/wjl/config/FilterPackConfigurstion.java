package com.wjl.config;

import java.io.IOException;

import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
//创建一个类实现TypeFilter接口与方法
public class FilterPackConfigurstion implements TypeFilter{
	/**
	 * MetadataReader 读取到当前正在扫描的类的信息
	 * MetadataReaderFactory 可以获取到其他类信息
	 */
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		//获取到当前类注解的信息
		AnnotationMetadata annotdata = metadataReader.getAnnotationMetadata();
		//获取到正在扫描的类的信息
		ClassMetadata classdata = metadataReader.getClassMetadata();
		System.out.println(classdata.getClassName());
		//includeFilters/includeFilters = 
		//@Filter(type=FilterType.CUSTOM,classes= {FilterPackConfigurstion.class})
		//例子：当扫描到的类包含dao时就让它 【被/不被】 扫描进容器
		if (classdata.getClassName().contains("dao")) {
			return true;
		}
		return false;
	}
}
