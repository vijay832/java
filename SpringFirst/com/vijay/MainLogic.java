package com.vijay;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		List x=s.getCourse();
		Iterator i=x.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Set y=s.getStudentName();
		Iterator j=y.iterator();
		
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		Set<Entry<String, String>> set=s.getCourseRegistration().entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("StudentName: "+entry.getKey()+" Course registered:"+entry.getValue());  
	}
	}

}
