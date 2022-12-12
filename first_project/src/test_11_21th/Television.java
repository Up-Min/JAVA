package test_11_21th;


public class Television implements RemoteControl {
	// 인터페이스를 상속받기 위한 방법, implements

	// abstract와 비슷하게, 상속만을 위해 쓰이는 애들이기 떄문에
	// 반드시 자식 클래스에 오버라이드로 구현을 해놔야함.

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켰어");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 껐어");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨은 "+ volume);

	}

}
