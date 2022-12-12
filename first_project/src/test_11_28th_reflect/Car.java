package test_11_28th_reflect;

public class Car {
	public static void main(String[] args) throws ClassNotFoundException {
//		Class clazz = Car.class; //object class's name is class, to get class object info.
//		Class clazz = Class.forName("test_11_28th_reflect.Car"); //second way to get class object info.
		
		Car car = new Car(); // declare class wants to get info.
		Class clazz = car.getClass(); // set get class, declare Class, third way to get class object info
		
		
		System.out.println("패키지 이름 : " + clazz.getPackage().getName());
		// get Package's info + name

		System.out.println("클래스의 간단한 이름 : " + clazz.getSimpleName());
		// pacakge's name (shortly)
		
		System.out.println("클래스의 전체 이름 : " + clazz.getName());
		
		
	}
}
