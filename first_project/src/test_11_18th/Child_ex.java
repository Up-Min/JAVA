package test_11_18th;

public class Child_ex {

	public static void main(String[] args) {
		
		// 객체 선언.
//		Child ch = new Child();
//		Parent pa = ch; 
//		// Parent에 Child ch를 넣어줌. 부모에게 자식을 넣어준 것이므로 자동타입변환임.
//		
//		// 메소드 호출 (자동타입 변환시)
//		pa.method1(); //Parent-method1 정상적으로 상속 및 출력
//		pa.method2(); // 오버라이드에 따라 Child-method2 출력
//					  // ★ 자식에게 있는 것을 가져오는 느낌!
////		pa.method3(); // 컴파일 에러 - parent에 정의되지 않았다!
//		// ★ 자동형변환이 일어나면, 자식객체에 있는 메소드는 불러오지 못한다. 
//		// 이는 필드에도 동일하게 적용된다.
//		
//		pa.a = 2;
////		pa.b = 2;// 자식객체에 있는 필드도 불러올 수 없어짐.
		

		// 강제 형변환
		Parent pa = new Child(); // 자동타입 변환
		Child ch = (Child)pa; // 강제타입 변환
		// 자동타입 변환으로 선언한 뒤에 강제타입 변환을 해야한다.
		
// 강제타입변환을 하기 전에 parent에 child가 들어가 있는지 확인해야 할 필요가 있을 떄
// 혹은 객체의 타입을 확인하고 싶을 때 쓰는 instanceof
		
	if(pa instanceof Child) //parent 매개변수가 Child객체를 품고 있는가?
	{	// 자식객체에 있는 메소드, 필드에 접근하고 싶을 때 강제변환으로 접근 가능.
		ch.b = 1; 
		System.out.println(ch.b);
		ch.method3();
	}// 이걸 왜 함?
	// parent가 Child를 가지고 있지 않으면 강제타입 변환을 할 수 없기 때문에,
	// 확인 겸 해서 써주는 것이 좋다. 
	

		
		
		
		
		
	}

}
