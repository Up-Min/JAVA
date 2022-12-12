package test_11_17th;
//오 오버라이드
public class Computer extends Calculator {

	@Override
	public double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer객체의 areaCircle() 실행");
		return Math.PI * r * r;
	} //제러네이터를 이용한 오버라이드 생성, 아무것도 써주지 않으면 결과는 똑같다.
	// 오버라이드 : 부모클래스에 있는 메소드를 재정의 해주는 역할임.
	// 반환형, 메소드 이름, 매개변수가 모두 같아야 함.
	
	
}
