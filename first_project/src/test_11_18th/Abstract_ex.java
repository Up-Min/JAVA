package test_11_18th;

public class Abstract_ex {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		// 매개변수의 다형성
		animalSound(dog);
		animalSound(cat);
	}

	public static void animalSound(Animal animal) {
		animal.sound(); // 일단 부모 매개변수 형태로 값을 받게 한다.
		// dog 객체를 넣는다 => Animal animal = new Dog()
		// animal이라는 애는 오버라이드 된 메소드만 사용할 수 있게 된다.
		// dog에 오버라이드 된 메소드 "멍멍"으로 나오게 됨.
		// 실행방법은 똑같으나, 추상클래스-추상메소드 사용법과, 아무것도 구현하지 않은 메소드를 선언하여
		// 순수 오버라이딩 용로도만 사용되는 메소드가 있음을 알자!
	}
	
}
