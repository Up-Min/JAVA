package test_11_18th;

//추상클래스가 부모이기 때문에, 추상메소드를 반드시 오버라이드 해줘야 한다!
public class Dog extends Animal{

	@Override 
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
	
}
