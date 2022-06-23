/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.lang.reflect.Method;


public class Mavenproject1 {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        Class<TestClass> classNameInstance = TestClass.class;
        String className = classNameInstance.getSimpleName();
//        System.out.println(className.charAt(0));
        
        if(className.charAt(0)>= 'A' && className.charAt(0) <= 'Z'){
            System.out.println(className + " is a pascal case");
        }
        else{
            System.out.println(className + " is not pascal case");
        }
        
        Class<newTestclass> classNameInstance2 = newTestclass.class;
        String className2 = classNameInstance2.getSimpleName();
//        System.out.println(className.charAt(0));
        
        if(className2.charAt(0)>= 'A' && className2.charAt(0) <= 'Z'){
            System.out.println(className2 + " is a pascal case");
        }
        else{
            System.out.println(className2 + " is not pascal case");
        }
        
        String camelCasePattern = "([a-z]+[A-Z]+\\w+)+"; // 3rd edit, getting better
        System.out.println("camelCaseCaseCCase5".matches(camelCasePattern));
         
        try {
			// create class object
			Class classobj = TestClass.class;

			// get list of methods
			Method[] methods = classobj.getMethods();

			// get the name of every method present in the list
                        
                        //System.out.println(methods);
			for (Method method : methods) {

				String MethodName = method.getName();
                                if (MethodName.matches(camelCasePattern)){
                                    System.out.println("method: "
								+ MethodName +" is a camel case pattern");
                                }
                                else{
                                    System.out.println("method: "
								+ MethodName +" is not camel case pattern");
                                }
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
    }
}
