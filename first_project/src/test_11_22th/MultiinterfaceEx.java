package test_11_22th;

public class MultiinterfaceEx {

	public static void main(String[] args) {

		// 다중상속 사용하는 방법, 객체를 두개를 만들어준다.
		// 1. 인터페이스 클래스명 넣어주기
		RemoteControl rc = new SmartTelevision(); //자동형변환
		// 리모트 컨트롤에서 오버라이드 받은 켜고 끄는거 작동
		rc.turnOn();
		rc.turnOff();
		
		// 2. searchable 클래스도 넣어주기
		Searchable sc = new SmartTelevision();
		// 서쳐블에서 오버라이드 받은 url 작동
		sc.search("google.com");
	}

}
