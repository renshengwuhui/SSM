package ssmtest.ssmtest1.dao.util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.jca.context.SpringContextResourceAdapter;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ssmtest.ssmtest1.util.SpringContextUtil;

public class SqlSessionFactoryUtil {
	 private static SqlSessionFactory sqlSessionFactory=null;
	    public static SqlSessionFactory getSqlSessionFactory(){
	        if(sqlSessionFactory==null){
	        	try {
	        		/*WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
	        		SqlSessionFactoryBean factoryBean =(SqlSessionFactoryBean)wac.getBean("sqlSessionFactory");*/
	        		SqlSessionFactoryBean factoryBean
	        			=(SqlSessionFactoryBean)SpringContextUtil.getBean("sqlSessionFactory");
	        		sqlSessionFactory=factoryBean.getObject();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//java.lang.ClassCastException: org.apache.ibatis.session.defaults.DefaultSqlSessionFactory cannot be cast to org.mybatis.spring.SqlSessionFactoryBean
				}
	        }
	      return sqlSessionFactory;
	    }
}
