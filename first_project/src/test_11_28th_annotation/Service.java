package test_11_28th_annotation;
//@PrintAnnotation
public class Service {
//	//field //	@PrintAnnotation //	String test; //	//constructor //	@PrintAnnotation 
//	public Service() {}
	
	// method
	@PrintAnnotation // attach @PrintAnnotation where want to adapt
	public void method1() {
		System.out.println("method1");
	}
	@PrintAnnotation
	public void method2() {
		System.out.println("method2");
	}
	@PrintAnnotation (value = "#", number = 20)
	// 1. like querystring, can give addtional value to annotation.
	public void method3() {		
		System.out.println("method3");
	}

}
