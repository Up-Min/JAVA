package test_11_16th;

public class This {

	//필드 생성
	
	String model;
	int speed;
	
	// 생성자 생성
	This(String model){
		this.model = model;
	// 매개변수명이 필드에 있는 데이터명과 같으면, 필드데이터에는 this를 붙인다.
		//즉, this는 같은 이름을 구분하는 역할을 한다.
	}
	
	// 2void
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		// 같은 클래스 안에 선언 된 setSpeed를 사용하기 위해 this를 쓴다.
		// 사실 this.안붙여도 차이는 없다. (생략가능)
		
		System.out.println(this.model+","+this.speed);
		// 필드의 데이터명과 매개변수명을 구분하기 위해 this.를 붙인다.
		
	}
	
}
