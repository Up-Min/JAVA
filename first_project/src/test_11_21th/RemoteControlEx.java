package test_11_21th;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("===================");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.ChangeBattery();
		
		
		
		
//		// 인터페이스에 대한 자동 형변환 실시
////		RemoteControl rc = new Television();
////		rc.turnOn();		
////		RemoteControl ra = new Audio();
////		ra.turnOn();
//		
//		//원리는 다형성과 동일함, 이름이 인터페이스인것과 추상메소드를 사용하는 것만 다름.
//		// 자동형변환이 이루어졌을 때는 자식 클래스에서 오버라이드 된 것만 호출하므로
//		// tv를 키게 된다.
//		
//		//인터페이스가 가장 두드러지는 부분적인 부분.
//		/*유독 인터페이스가 갈아끼우기 하기가 편하다.*/
//		
//		RemoteControl rc; 
//		rc = new Television();
//		rc.turnOn();
//		rc.setVolume(5);
//		rc.turnOff();
//		
//		rc = new Audio();
//		rc.turnOn();
//		rc.setVolume(5);
//		rc.turnOff();
//		
//
//		// 같은 RemoteControl 상속을 받고 있으면 저렇게 갈아끼울 수가 있다.
//		//static의 특성을 가지지 않았기 때문에 객체를 생성하지 않고 호출한다.
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);
//	
//		
		
		
	}

}
