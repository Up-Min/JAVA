package test_11_18th;

public class Car {

	// 필드로 타이어 객체 만들기
	public Tire tire;
	// 왜 필드로 뺐을까? 필드로 다형성을 구현하기 위해.
		// (아직 객체는 넣어주지 않음)
	
	
	public void run() {
		tire.roll();
		// 타이어를 굴린다. - Tire roll 실행
		
		
		
	}
}
