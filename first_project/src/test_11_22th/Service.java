package test_11_22th;

public interface Service {
	
	// 디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
	}
	
	// 정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");	
	}

	//private 붙이는 메소드 만들기 (그냥 private, static private)
//	private void defaultCommon() {
//		System.out.println("defaultCommon 종속 코드");			
//	} java8에서는 지원안됨.

	
	

}
