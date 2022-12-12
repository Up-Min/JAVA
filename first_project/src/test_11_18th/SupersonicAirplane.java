package test_11_18th;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		}else {
			super.fly();
					}
	}
	// 오버라이드를 통해 부모클래스에 있는 메소드 실행 가능해짐.
	// 그리고 새로운 내용 (supersonic시에!)을 추가해서 
	// 이 클래스에 최적화된 값을 내보낼 수 있도록 해줌.
	
	
}
