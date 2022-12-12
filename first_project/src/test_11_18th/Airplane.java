package test_11_18th;

// 클래스 앞에 final을 불여버리면 그 클래스는 부모클래스로 사용할 수 없어짐.
//public final class Airplane {
public class Airplane {

	public void land() {
		System.out.println("착륙");
	}
	// 메소드 앞에 final을 붙이면 얘는 오버라이드 할 수가 없어짐.
//	public final void fly() {
		public void fly() {
		System.out.println("일반 비행");
	}
	public void takeOff() {		
		System.out.println("이륙");
	}
	
}
