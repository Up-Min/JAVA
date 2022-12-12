package test_11_18th;

public class Car_ex {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.tire = new HankookTire();
		// 오버라이드를 했기 때문에 new Tire 에서 new HankookTire로 바꿀 수 있음.
		// tire의 상속받은 자식 클래스가 오버라이드를 했기 때문에, HankookTire에 있는 값이 돌아감.
		// 거대한 버전의 switch - case라 이해할 수 있음.
		
		
		c.run(); // 이렇게 하면 에러가 남.
		// 아직 객체가 들어가 있지 않기 때문에;.
		// 객체 들어간 이후 다시 제대로 들어감.
		
		
		// 자 이제 타이어 갈아끼우자.
		// c.tire = new Tire(); => c.tire = new HankookTire();
		
		
		
		
		
	}

}
