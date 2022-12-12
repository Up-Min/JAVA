package test_11_21th;

public interface RemoteControl {
	
	/*
	 *  인터페이스에 선언 된 필드는 모두 
	 *  public static final
	 	특성을 갖는다.
	 */ 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	
	// 추상메소드, 상수만 조정할 수 있다.
	/*
	 *  public이 없어도 컴파일 과정에서 public이 자동으로 붙는다
	 	추상 메소드이기 때문에 public abstract가 붙게 됨.
	 	(다중상속 여부?) 와 관련 됨.
	 */
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 : 인터페이스에서 실행 메소드를 구현하고 싶을 때 사용.
	default void setMute(boolean mute) {// 음소거
		if(mute) {
			System.out.println("음소거 처리 합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("음소거 해제.");
		}
	}
	

	
	// 정적(static) 메소드
	// 특징 1. 코드를 구현할 수 있다.
	// public이 없어도 컴파일 과정에서 public이 붙는다.
	static void ChangeBattery() {
		System.out.println("건전지 교체");

	}

	
	
	
	
	
	
	
	
}
