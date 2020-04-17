package com.techlab.reflection.test;

import java.lang.reflect.*;

import java.lang.reflect.Modifier;

public class ReflectionTest extends Modifier{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		
		Class cls = Class.forName("com.techlab.rectangle.Rectangle") ;

		printConstructorsInfo(cls);
		
        printVariablesInfo(cls);

		printAllMethodsInfo(cls);
		
		printPublicMethodsInfo(cls); 
		
		printGettersInfo(cls);        
        
		printSettersInfo(cls);
        
	}
	
	private static void printVariablesInfo(Class cls) {
		System.err.println("\nThe Fields of class are : ");
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) 
			System.out.println(toString(field.getModifiers())+" "+field.getName()); 
	}

	private static void printAllMethodsInfo(Class cls) {
		System.err.println("\nThe methods of class are : ");
        Method[] methods = cls.getDeclaredMethods(); 
        for (Method method:methods) 
            System.out.println(toString(method.getModifiers())+" "+method.getName()); 
	}

	private static void printSettersInfo(Class cls) {
		Method[] methods = cls.getMethods(); 
		System.err.println("\nThe setters of class are : ");
        for (Method method:methods) {
        	if(method.getName().startsWith("set")&& method.getParameterCount() == 1 )
            System.out.println(method.getName()); 
        }
	}

	private static void printGettersInfo(Class cls) {
		Method[] methods = cls.getMethods(); 
		 System.err.println("\n\nThe getters of class are : ");
	        for (Method method:methods) {
	        	if(method.getName().startsWith("get")&& method.getParameterCount() == 0 )
	            System.out.println(method.getName()); 
	        }
		
	}

	private static void printPublicMethodsInfo(Class cls) {
		System.err.println("\nThe public methods of class are : ");
        Method[] methods = cls.getMethods(); 
        for (Method method:methods) 
            System.out.println(toString(method.getModifiers())+" "+method.getName()); 
	}

	private static void printConstructorsInfo(Class cls) throws NoSuchMethodException, SecurityException {
		Constructor constructor = cls.getConstructor(); 
        System.out.println("The name of constructor is " + constructor.getName());
	}

}
