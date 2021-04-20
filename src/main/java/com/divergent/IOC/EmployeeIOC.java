package com.divergent.IOC;





import org.springframework.context.ApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.divergent.service.Employee;



public class EmployeeIOC {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new FileSystemXmlApplicationContext("E:\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\spring-Example\\src\\main\\java\\com\\divergent\\IOC\\Confi.xml");
		Employee employee=(Employee)context.getBean("employeebean"); 
	    employee.displayInfo();
	}

	
}
