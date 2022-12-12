package test_11_15th;

public class Car2 {

	//인스턴스 필드, 메소드
	int speed;
	void run() {
		System.out.println(speed + " 로 달림.");
	}
	
	void run2() {
		this.run();
		System.out.println(speed + " 로 달림.");
	}
	
	static {
		//this.speed = 200; // 정적 블록 안에 인스턴스 필드를 가져올 수가 없다.
	}
	
	// 정적 메소드
	static void simulate() {
		
		//this.speed = 200; // 인스턴스 메소드
		//this.run(); 
		// 그래서 static안에서 사용할 수 없음 (new 선언 안되어서 메모리가 적재가 안됨)
		
		Car2 myCar = new Car2();
		myCar.speed = 200;
		myCar.run();
		// 얘네는 new가 선언되어서 사용할 수 있어짐.
	}
	
	public static void main(String[] args) {
		simulate(); // static 메소드도 같은 클래스 안에 있는 애이기 떄문에 굳이 클래스 명을 붙일 필요는 없음.
		
		// this.speed = 200; // 찍을 수 없어짐
		// this.run() ; // 얘도 동일함
		
		// 시뮬레이터가 끝나면 그 뒤에 애가 끝남.
		
		Car2 myCar = new Car2();
		
		myCar.speed = 200;
		myCar.run();
		
				

	}

}
