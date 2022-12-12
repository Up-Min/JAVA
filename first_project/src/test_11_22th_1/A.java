package test_11_22th_1;

public class A {
	// 인스턴스 멤버 클래스
	
	// public, default, private 접근제한자 사용가능
	class B {
		// 필드 작성
		int field1 = 1;
		// 생성자
		B(){
			System.out.println("B 생성자 실행");
		}
		
		//메소드
		void method1() {
			System.out.println("B의 메소드 1 실행");
		}
	}
	/*
	A와 B의 긴밀한 관계가 생기는 아이들, 
	 특정클래스와 긴밀한 관계가 필요할 경우에 쓰는게 좋음.
	 2가지 장점이 있는데, 
	   1. 접근하기 편하다는 장점과
	   2. 외부에서는 a를 통해 b를 가져올 수 있게 때문에 
	   	  불필요한 관계 클래스를 안해도 된다.
	 */
	
	
	void useB() {
		B b = new B();
		System.out.println(b.field1); 
		b.method1();
	}
	
//	// 1. B클래스를 필드로 생성
//	B field = new B();
//	
//	// 2. A클래스 생성자에서 사용 가능
//	A(){
//		B b = new B();
//	}
//	
//	// 3. 메소드에서 사용 가능
//	void method() {
//		B b = new B();		
//	}
}
