package test_11_17th;

// 부모클래스

public class phone {

	// 필드
	public String model; // 모델명
	public String color; // 컬러

	// 생성자 만들기 
//	public phone() {
//		System.out.println("부모 생성자 호출");
//	}
	public phone(String model, String color) {
		System.out.println("부모 생성자 호출");
		this.model = model;
		this.color = color; 				
	}
	
	// 메소드 생성.
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String message) {
		System.out.println("본인 목소리 : " + message);
	}

	public void receiveVoice(String message) {
		System.out.println("상대방 목소리 : " + message);

	}

	public void hangUp() {
		System.out.println("전화 끊기");

	}

}
