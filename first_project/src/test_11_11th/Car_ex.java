package test_11_11th;

public class Car_ex {

	public static void main(String[] args) {
		Car myCar = new Car();
		/* 객체 요약
		 Car 클래스의 생성자에서 선언한 매개변수에 맞춰서 값을 넣어줌
		 넣은 값은 Car.java\Car에 서언한 model, color, maxSpeed에 들어가고
		 this.매개변수에 값이 들어가게 됨. 그리고 해당 문서 6,7,9번 라인에 선언한 값에
		 해당 값이 들어가게 됨.
		 위의 과정을 통해 model, color, maxSpeed 값이 할당되어 있기 때문에
		 model, color, maxSpeed를 출력할때도 그 값이 그대로 나옴.

		System.out.println(myCar.company);
		System.out.println(myCar.start);
		System.out.println(myCar.speed);
		
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		넣어준 값으로 결과값이 바뀌게 됨*/
		
		System.out.println(Car.numbering);
		Car car2 = new Car ();
		System.out.println(Car.numbering);
		
		System.out.println("-------------------");
		Car car3 = new Car (); 
		// 2개가 선언되어 있는 Car클래스의 Car 생성자에 대응함.
		System.out.println(Car.numbering);
//		System.out.println(car3.color);
		System.out.println("-------------------");
		Car car4 = new Car ();
//		System.out.println(car4.model);
//		System.out.println(car4.color);
		System.out.println(Car.numbering);
		System.out.println("-------------------");
	// 스태틱 쓰는 이유.
	/* 한대 생성될 때 마다 넘버링이 달린다 했을 때, 한대 생산할 때마다
	 * 넘버링이 증가값이 되어야하는데, 각자가 다른 인스턴스이기 때문에 넘버링 변수가
	 * 계속 초기화가 됨.
	 * 전역변수로서 static int numbering을 해버리면 값이 증가값으로 가능함.
	 * 하나가지고 계속 증가가 되기 때문에, 일정하게 값을 올릴 수 있어짐. 
	 */
		

	}

}
