package data;
public class Situation {
	
	static Fuel F = new Fuel();
	
	public static void alertFuel() {
		if(F.getFuelLevel() < 30) {
			System.out.println("피트인 해서 기름을 보충 하는 것을 권하지.");
		}else if(F.getFuelLevel() < 10) {
			System.out.println("지금 당장 피트인 해!!! 차 멈추는 꼴 보고싶어??!");
		}
	}
	
	public static void alertPunture() {
		System.out.println("당장 피트인 해! 펑크로 리타이어 되고 싶지 않으면!");
	}
	
	public static void alertRain() {
		System.out.println("이봐, 비가 온다구. 타이어는 교체했나? 굼뱅이보다 느리게 가고 싶지 않다면 바꾸는게 좋을거야.");
	}
	
}
