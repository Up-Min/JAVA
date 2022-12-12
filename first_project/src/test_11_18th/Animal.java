package test_11_18th;

public abstract class Animal {

	// 일반메소드 
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드
	// 추상메소드는 자식클래스에서 반드시 오버라이드를 해줘야한다.
	public abstract void sound(); // 그래서 이렇게 써줘야 함.
							//abstract를 붙이면 에러가 남. 

	
}
