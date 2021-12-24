package com.wjl.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.objenesis.strategy.PlatformDescription;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.pool.DruidDataSource;


/**
 * 事务的处理
 * 	第一步：将设计数据库事务的方法标注上【@Transactional】
 * 		   表示这是一个事务方法
 * 	第二步：在配置类上标注【@EnableTransactionManagement】
 * 		   表示开启事务，这时，事务才会起作用
 *	第三步：将事务管理器【DataSourceTransactionManager】注册在容器当中，
 *		   管理相应的数据源【DataSource】
 */
@EnableTransactionManagement
@Configuration
@ComponentScan("com.wjl.shiwu")
public class SpringConfigShiWu {
	@Bean
	public DataSource getDataSource() throws Exception{
		DruidDataSource source = new DruidDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/usertest");
		source.setPassword("123456");
		source.setUsername("root");
		return source;
	}
	@Bean
	public DataSourceTransactionManager transactionManager() throws Exception {
		return new DataSourceTransactionManager(getDataSource());
	}
	@Bean
	public JdbcTemplate jdTemplate() throws Exception{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
}
