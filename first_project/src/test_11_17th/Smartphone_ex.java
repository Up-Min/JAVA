package test_11_17th;

public class Smartphone_ex {

	public static void main(String[] args) {
		Smartphone phone = new Smartphone("아이폰","레드");
		
		//phone이라는 이름으로 객체를 생성함. Smartphone에서는 super로 부모의 model, color을 바로 가져옴.
		//즉 phone의 아이폰, 레드는 곧바로 Smartphone의 부모에 해당하는 model과 color에 들어가게 됨.
		
		
		//phone에서 상속받은 필드 읽기
		System.out.println(phone.model +","+phone.color);
		// 자식 객체에서 부모 메소드에 접근이 가능하다.
		phone.bell(); phone.sendVoice("hello?"); phone.receiveVoice("speaking."); phone.hangUp();
	
		phone.setWifi(true);
		phone.internet();
	}

}
