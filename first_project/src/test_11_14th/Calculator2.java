package test_11_14th;

public class Calculator2 {
	
	
	
	//static 적용
	static double pi = 3.141592;
	static int plus (int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}

	
	//정적 블록 (스태틱 변수에 초기화가 필요할 경우 사용)
	static String model = "calc1";	
	static String number = "1";
	static String info;
		// info 변수에 모델 이름을 넣고 싶어질 때
	static {
		info = model+ "_" +number; //info에 값이 들어감.
		// 정적필드는 this를 안붙여도 됨.
		
	}
	
	
	
//	// 필드
//	double pi = 3.141592;
//	
//	
//	// 메소드
//	int plus (int x, int y) {
//		return x + y;
//	}
//	
//	int minus(int x, int y) {
//		return x - y;
//	}
	
	
	
	
}
