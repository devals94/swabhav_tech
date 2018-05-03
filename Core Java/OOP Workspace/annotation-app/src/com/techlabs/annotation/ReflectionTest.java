package com.techlabs.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		System.out.println("Testing...");
		int count = 0;
		Class<Foo> className = Foo.class;
		
		for(Method method : className.getDeclaredMethods()){
			if(method.isAnnotationPresent(RequireRefactoring.class)){
					method.invoke(className.newInstance());
					System.out.printf("Test '%s' %n",method.getName(),++count);   
			}
		}
		System.out.printf("Total Count '%s' ", count);
	}
}
