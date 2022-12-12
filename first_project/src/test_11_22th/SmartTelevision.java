package test_11_22th;

// 여기서 두개의 인터페이스를 동시에 상속받을 예정
public class SmartTelevision implements RemoteControl, Searchable {
	// 자동으로 2인터페이스에 있는 총 3개의 메소드를 받아옴.
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켰어");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 껐어");		
	}

	
	
	
	
	
	//인터페이스의 특징 : 인터페이스가 인터페이스를 상속 받을 수도 있다.
	
}
