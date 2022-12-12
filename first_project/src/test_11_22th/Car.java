package test_11_22th;

public class Car {
	// 필드선언
	Tire T1 = new HankookTire();
	Tire T2 = new HankookTire();
	
	// 메소드 선언
	void run() {
		T1.roll();
		T2.roll(); // 둘다 한국 타이어이기 때문에 돌아가는게 똑같다.
		// 어떻게 다형성을 구현할 것인가?
		// main으로 가자
	}
	
}
