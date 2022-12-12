package test_11_17th;
// 자식클래스

public class Smartphone extends phone{ // extends + 부모클래스 선언

	// 스마트폰에서만 쓸 필드 생성
	public boolean wifi;
	
	// 생성자 생성
	public Smartphone(String model, String color) {
		super(model,color); // 딱히 부모 클래스의 생성자가 받을게 없는 경우, 이렇게 표현하면 됨.
		System.out.println("자식 생성자 호출"); // 심지어 자식 생성자 호출이 부모 생성자 호출보다 앞에 있으면 안 됨.
	}
	
	// 메소드 생성
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경.");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
	
	
	/*	상속에 대한 고찰
	 *  기본적으로 전화기에 있는 메소드를 phone에서 생성해놓고,
	 * 	스마트폰에서만 구동할 수 있는 메소드를 smartphone에서 구현한다.
	 * 	즉, 부모클래스와 자식클래스의 코드간 관계를 잘 유의하여,
	 *  주요 공통구동 메소드를 부모클래스에 설정해놓고 자식클래스는 특화된 메소드를 구현하는 형태로
	 *  코드를 구성한다.
	 */
}
