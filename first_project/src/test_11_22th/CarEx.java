package test_11_22th;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car(); //Car에 대한 객체 선언
		myCar.run(); //결과값 두개 나옴

		// 타이어 객체 교체
		myCar.T1 = new KumhoTire(); // 그냥 그대로 교체만 함
		myCar.T2 = new KumhoTire(); // 그냥 그대로 교체만 함
		myCar.run();
	}

}
