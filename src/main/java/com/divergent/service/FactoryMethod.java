package com.divergent.service;
/**
 * Factory Method
 * @author Jayant
 *
 */
public class FactoryMethod {

		private static final FactoryMethod obj=new FactoryMethod();  
		private FactoryMethod(){
			System.out.println("private constructor");
			}  
		public static FactoryMethod method(){  
		    System.out.println("factory method ");  
		    return obj;  
		}  
}
