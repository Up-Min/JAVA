package test_11_21th;

public class Audio implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켰어");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 껐어");
	}

	private int memoryVolume;
	
	
	// 디폴트 메소드는 오버라이드시 반드시 public 접근 제한자를 붙여야한다.
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("음소거 처리");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("음소거 해제");
			setVolume(this.memoryVolume);
		}
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
