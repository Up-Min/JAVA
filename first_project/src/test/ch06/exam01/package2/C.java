package test.ch06.exam01.package2;

import test.ch06.exam01.package1.A;

public class C {
	public C() {
		A a = new A();
		
//		a.field1 = 1; 
//		a.field2 = 1; //다른 패키지이기 때문에 default 생성자가 접근할 수 없어짐
//		a.field3 = 1;
//		
//		a.method1();
//		a.method2(); //메서드도 동일하게 다른패키지이므로 default 실행 불가.
//		a.method3();
	}
	
	
	
	
	
	
	
	//A a = new A(true); 
	//A b = new A(3); //다른 패키지이므로, dafault가 사용이 불가능하다.
	//A c = new A("name"); //private도 당연히 안된다.
}
