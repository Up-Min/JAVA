package test_11_28th_reflect;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
import java.lang.reflect.*;
import java.util.Arrays;

import review_11_19th.static_base;

public class ReflectionEx {
	// to get member's (Constructor, field, method)
	public static void main(String[] args) {		
		
		Class clazz = Car2.class; // declare Car object.
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		// java.lang.reflect
		// return array Car2, Car2(String)
//		System.out.println(Arrays.toString(constructors));
		for(Constructor cons : constructors) {
			System.out.print(cons.getName() + "(");
			Class[] Parameters = cons.getParameterTypes();
			PrintParameters(Parameters);
			System.out.println(")");
		}				
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
			//field.getname() -> return field's name as String value.
		}		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method meth : methods) {
			System.out.print(meth.getName() + "(");
			// Call Parameter's type.
			Class[] Parameters = meth.getParameterTypes();
			
			//input Paramerters into PrintParameters
			PrintParameters(Parameters);
			System.out.println(")");
		}
		// to return getModel -> getModel()
		// 			 setModel() -> setModel(java.lang.String)
		
	}
	
	private static void PrintParameters(Class[] paramethers) {
		for (int i=0; i<paramethers.length; i++) {
			System.out.print(paramethers[i].getName());
			/* at first, bring type's name (java.lang.String , int)
			 * 
			 */
			if(i<paramethers.length-1) {
				System.out.print(",");
				// if, another parameter follow, attatch ','
			}
		}
	}	
}
