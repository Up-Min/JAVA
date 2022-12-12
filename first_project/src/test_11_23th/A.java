package test_11_23th;

public class A {
	// A class's instance field, method declare
	
	int field1;
	void method1() {
		
	}
	
	// A class's static field, method declare.
	static int field2;
	static void method2() {	}
	
	
	
	//instance member class 
	class B {
		void method() {
			field1 = 10; //instance field, method access with no interrupt.
			method1();
			
			field2 = 10; // static field, method also same.
			method2(); 
		}
	} // in b class's side, outside is class A.
	
	
	// static member class
	static class C {
		void method() {
			// instance field, method can't allows to access .
			// in static class, can't access outside class's instance field, method. 
//			field1 = 10; 
//			method1();
			
			field2 = 10; // static field, method allows to access
			method2(); 
		}
	}
}
