package ssmtest.ssmtest1.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextUtil implements ApplicationContextAware{
	private static ApplicationContext applicationContext; 
	@Autowired
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		SpringContextUtil.applicationContext = applicationContext;  
	}
	
	public static ApplicationContext getApplicationContext() {  
        return applicationContext;  
    }  
	public static Object getBean(String name) throws BeansException {  
        return applicationContext.getBean(name);  
    }  
}
