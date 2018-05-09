package com.techlabs.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.techlabs.account.Account;

public class TestReflection {
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		System.out.println("Total No. of Methods: " + reflectOut(String.class));
		System.out.println("Method Names are: ");
		displayMethodNames(String.class);
		System.out.println();
		System.out.println("Total No. of Methods: " + reflectOut(Object.class));
		System.out.println("Method Names are: ");
		displayMethodNames(Object.class);
		System.out.println();
		System.out.println("Total No. of Methods: " + reflectOut(Object.class));
		System.out.println("Method Names are: ");
		displayMethodNames(Account.class);
		System.out.println();
		displayConstructor(String.class);
		System.out.println();
		displayConstructor(Object.class);
		System.out.println();
		displayConstructor(Account.class);
		System.out.println();
		displayFields(String.class);
		System.out.println();
		displayFields(Object.class);
		System.out.println();
		displayProperties(Account.class);
	}

	private static int reflectOut(Class className) {
		int count = 0;
		Method[] methods = className.getMethods();
		count = methods.length;
		return count;
	}

	private static void displayMethodNames(Class className) {
		Method[] methods = className.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

	private static void displayConstructor(Class className) {
		Constructor[] cs = className.getConstructors();
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
	}

	private static void displayFields(Class className) {
		Field fields[] = className.getDeclaredFields();
		for (Field fld : fields)
			System.out.println(" " + fld.getName());
	}

	private static void displayProperties(Class className) {
		Method[] properties = className.getMethods();
		for (Method pro : properties) {
			String name = pro.getName();
			if (name.startsWith("get") || name.startsWith("is")) {
				System.out.println(" " + pro.getName());
			}

		}
	}
}
