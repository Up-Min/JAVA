package test_11_22th_1;

public class A_Ex {

	public static void main(String[] args) {
		// 사용하는 방법
		// A클래스 내부가 아닌 외부에서 사용하는 방법
//		A a = new A();
//		
//		A.B b = a.new B();
		// 평소 객체 선언하듯이, 앞에 a.을 붙인다.
		
		A a = new A();
		a.useB();
		
	}

}
