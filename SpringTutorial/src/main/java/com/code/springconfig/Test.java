package com.code.springconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ApplicationContext con=new AnnotationConfigApplicationContext(javaconfig.class);
		Student st=con.getBean("getStudent",Student.class);
		System.out.println(st);
		st.study();
		Samosa sam=con.getBean("getSamosa",Samosa.class);
		System.out.println(sam);
	}

}