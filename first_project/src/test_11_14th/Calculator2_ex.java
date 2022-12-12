package test_11_14th;

public class Calculator2_ex {

	public static void main(String[] args) {
//		Calculator2 cal = new Calculator2(); // 객체(인스턴스) 생성
		
		// 원래는 인스턴스를 통해서만 인스턴스멤버에 접근할 수 있다. 
//		cal.pi = 10;
//		System.out.println(cal.plus(5, 5));	
//		System.out.println(cal.minus(5, 5));	

		//인스턴스를 생성하고 인스턴스를 통해 값을 내보내야 하지만. static은 다르다.
		System.out.println(Calculator2.plus(1, 2)); 
		System.out.println(Calculator2.minus(1, 2));
		System.out.println(Calculator2.pi); 
		
		
	}
}
