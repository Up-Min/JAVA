package test_11_18th;

public class B {

	// A에 선언된 protected를 같은 패키지에서 접근 가능한지 여부를 확인
	
	public void method() {
		A a = new A(); // 이상없이 클래스 접근 가능
		a.field = "1"; // 필드 접근 가능
		a.method(); // 메소드도 접근 가능
	}
	
}
