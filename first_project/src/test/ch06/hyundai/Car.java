package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	// 다른 패키지인 hankook의 snowTire에 접근하고 싶을경우! import를 해준다.
	SnowTire snowT = new SnowTire();
	AllSeasonTire allT = new AllSeasonTire();

	Test test = new Test();
	
	//import를 안쓰고 가져올 수 있는 방법
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
	
	
}
