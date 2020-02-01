package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//there is a bean called TextEditor which is its id, its value is different
		TextEditor obj = (TextEditor) context.getBean("textEditor");
		obj.spellCheck();
	}

}
