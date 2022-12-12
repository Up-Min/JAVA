package test_11_22th;

public class Driver {
	
	void driver(Vehicle_ vh) {
		vh.run(); // 추상메소드 호출
		// 추상메소드이기 떄문에 반드시 호출해야한다만 제외하면
		// 다른 형태의 다향성과 다른 것이 없다.	
	}
	
}
