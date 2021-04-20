package com.divergent.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.divergent.service.FactoryMethod;



public class FactoryIOC {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("E:\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\spring-Example\\src\\main\\java\\com\\divergent\\IOC\\Factory.xml");
		 FactoryMethod factoryMethod=(FactoryMethod)context.getBean("factorybean");
		 factoryMethod.method();
	}

}
