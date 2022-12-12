package test_11_18th2;

import test_11_18th.A;

public class D extends A{
	public D() {
		super(); // A클래스 생성자 호출. 이상없이 호출 가능.
	}
	public void method1() {
		super.field = "2";
		super.method(); // A클래스의 필드, 메소드도 정상 호출 가능
		
		this.field = "1";
		this.method(); // 상속을 받으면 this도 사용할 수 있다!
	}
	// 상속을 통해서 사용하는거는 되나, 직접 객체를 생성해서 사용할수는 없다.
//	public void method2() {
//		A a = new A(); 
//		a.field = "1"; 
//		a.method(); 
//	} 
}
