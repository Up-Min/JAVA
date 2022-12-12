package test_11_18th;

public class SupersonicAirplane_ex {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();

		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		// flyMode의 값이 바뀌기는 하나, super.fly만 원래 있었기 때문에, 
		// if로 추가 값을 바뀌게 하지 않는 이상은 초음속이 적용되지 않는다!
		
		sa.fly();
		
	}

}
