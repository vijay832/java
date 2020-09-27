package com.vijay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
	public static void main(String []args) {
		Resource res=new ClassPathResource("spring.xml");
		BeanFactory f= new XmlBeanFactory(res);
		Object o =f.getBean("rahul");
		Student s=(Student) o;
		System.out.println(s.getId()+"  "+s.getName()+"  "+s.getMarks());
	}

}
