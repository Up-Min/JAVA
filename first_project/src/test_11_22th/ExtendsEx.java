package test_11_22th;

public class ExtendsEx {

	public static void main(String[] args) {

		interfaceCimpl imp = new interfaceCimpl();
		// 인터페이스에서 인터페이스를 받았기 떄문에 유의해줘야함.
//		interfaceA ia = imp; // 자동 형변환
//		ia.methodA(); // 인터페이스 A의 메소드 A를 호출 -> imp안에 있는 메소드 A가 작동됨.
//		
//		interfaceB ib = imp;
//		ib.methodB();
		
		interfaceC ic = imp;
		ic.methodC(); 
		// 이렇게 하나하나 선언해줘도 되기는 함. 
		// 근데 인터페이스 C가 A,B한테 상속을 받잖아?
		
		ic.methodA();
		ic.methodB(); //A랑 B도 불러올 수 있어짐.
		
		
	}
}
