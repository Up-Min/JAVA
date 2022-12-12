package test_11_18th;

public class HankookTire extends Tire{

	//tire - roll 오버라이드
	@Override
	public void roll() {
		// 한국타이어만의 값 지정하기
		System.out.println("한국타이어 빠른 회전");
	}

}
