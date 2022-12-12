package test_11_11th;

public class Car {
	
	String company = "kia";
	String model = "소나타";
	String color = "검정";
	boolean start = true;
	int speed = 120;
	int maxSpeed = 300;
	
	// 생성자, 생성자는 class와 같은 이름으로 만들어야 함
	// 생성자를 따로 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다
	
	

	
	
	
	
	
	static int numbering = 0;
	Car(){
		numbering ++;
		// Car이 실행 될 때마다 numbering 추가
	}
	
	
	
	
	// this 키워드를 이용하여 각 생성자별로 중복되는 아이들을 처리해주기	
	Car(String model){
//		this.model = model;
		this(model,"은색",250);
		// 이렇게 하면 아래 3개를 호출함. 여기서 지정한 아이들이 그대로 아래 선언 된 3개에 넣어짐
		// 공통코드가 가장 많이 있는 하나를 출력해서 그 안에 애들을 넣는다.
		// 그래서 결과값은 지정한 모델명, 은색, 250이 나올 것
		
	}
	Car(String model, String color){
//		this.model = model;
//		this.color = color;
		this(model,color,250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}



}
