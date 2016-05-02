package com.estsoft.spring_container;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App { 
    public static void main( String[] args ) {
    	//beanFactoryTest();
    	applicationContextTest();
    }
    
    public static void beanFactoryTest() {
    	BeanFactory beanFactory =
    		new XmlBeanFactory(new ClassPathResource("config/applicationContext.xml") );
//    	BeanFactory beanFactory =
//        		new XmlBeanFactory(new ClassPathResource("config/applicationContext2.xml") );
    	
    	User user1 = beanFactory.getBean( User.class );
    	user1.setName( "안대혁" );
    	System.out.println( user1 );
    }
    
    public static void applicationContextTest() {
    	ApplicationContext applicationContext = 
    			new ClassPathXmlApplicationContext( "config/applicationContext.xml" );
    	
//    	User user1 = applicationContext.getBean( User.class );
//    	user1.setName( "안대혁" );
//    	System.out.println( user1 );
    	
    	User user1 = (User)applicationContext.getBean( "user1" );
    	System.out.println( user1 );
    	
    	User user2 = (User)applicationContext.getBean( "user2" );
    	System.out.println( user2 );
    	
    	User user3 = (User)applicationContext.getBean( "user3" );
    	System.out.println( user3 );
    	
    	User user4 = (User)applicationContext.getBean( "user4" );
    	System.out.println( user4 );
    	
    	((ConfigurableApplicationContext) applicationContext).close();
    }
}
