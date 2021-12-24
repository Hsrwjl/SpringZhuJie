package com.wjl;
1
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.wjl.config.MyImport;
import com.wjl.config.MyImportBeanDefinitionRegistrar;
import com.wjl.config.UserFactroyBean;


//@Configuration
//导入类作为组件到容器中组件名默认为全类名
//可以导入一个，也可以是数组的形式
//@Import(value = {User.class,Pig.class})
//使用自定义的类实现接口定制接口
//@Import(value= {MyImport.class,MyImportBeanDefinitionRegistrar.class})
public class SpringConfig3 {
	
	/**
	 * 依靠这个ID 取出来的都是User对象
	 * 如果想获取工厂Bean本身 需要在ID前面加上一个&符号
	 * 比如以下的 “&userBean”
	 */
	//@Bean("userBean")
	public UserFactroyBean getUserBean() {
		return new UserFactroyBean();
	}
}
