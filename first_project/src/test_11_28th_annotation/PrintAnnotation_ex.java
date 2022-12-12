package test_11_28th_annotation;


import java.lang.reflect.*;


public class PrintAnnotation_ex {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declMethods = Service.class.getDeclaredMethods();
// as use getDeclaredMethods, bring all method used in service.
		for (Method met : declMethods) {
		// make PrintAnnotation as type
		PrintAnnotation pa = met.getAnnotation(PrintAnnotation.class);
	//met.getAnnotation(info from annotation wants to get)
			
			printLine(pa); // from here
		
			met.invoke(new Service()); //running method 1,2,3
			// using getDeclaredMethods, can run method by
			// using new Service
			
		}
	}

	public static void printLine(PrintAnnotation pa) {// to here - sending pa
		
		if(pa != null) {
			//get numbertype value, get annotation's type.
			int number = pa.number();
			String value = pa.value();
			
			System.out.println(number);
			System.out.println(value);
			/*
			 * method 1 15, -
			 * method 2 15, - (none selected)
			 * method 3 20, #
			 * console order is random!
			 */
		}
	}
	
	
}
