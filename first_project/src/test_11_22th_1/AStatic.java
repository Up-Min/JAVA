package test_11_22th_1;

public class AStatic {
	// static 멤버 클래스
	// public, private, default 접근제한자 사용
	static class B {
		int field1 = 1;
		B(){
			System.out.println("b 생성자 실행");
		}
		void method1() {
			System.out.println("b 메소드 실행");	
		}
	}
	
	// 1. 중첩된 중첩 클래스를 인스턴스필드로 사용할 수 있다.
	B field = new B();
	// 2. 중첩 클래스를 생성자에서 사용할 수 있다.
	AStatic() {
		B b = new B();
	}
	// 3. 인스턴스메소드에서도 사용 가능하다.
	void method1() {
		B b = new B();
	}
	
	/*객체를 생성해야지만 사용할 수 있는 인스턴스 필드, 메소드인데
	 * 이를 정적필드 값으로도 사용할 수 있다.
	 */
	static B field2 = new B();
	
	// 정적 메소드도 사용이 가능하다.
	static void method2() {
		B b = new B();		
	}
}
