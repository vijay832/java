package com.jnit; 


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
	public static void main(String []args) {
		Resource res=new ClassPathResource("spring.xml");
		BeanFactory f= new XmlBeanFactory(res);
		Employee e =(Employee)f.getBean("kiran");
		e.show();
	}

}
