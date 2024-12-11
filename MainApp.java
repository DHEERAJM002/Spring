package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext acObj=new ClassPathXmlApplicationContext("Config.xml");
		Student sobj1=(Student)acObj.getBean("sobj1");
		Student sobj2=(Student)acObj.getBean("sobj1");
		System.out.println(sobj1);
		System.out.println(sobj2);
//		Student sobj3=(Student)acObj.getBean("sobj3");
//		System.out.println("ID:"+sobj.getSid());
//		System.out.println("Name:"+sobj.getSname());
//		System.out.println("Age:"+sobj.getSage());
		sobj1.display();
//		sobj2.display();
//		sobj3.display();
		acObj.registerShutdownHook();
	}

}
