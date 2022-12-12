package test_11_11th;

public class Calculator_ex {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		Car car1 = new Car(null);
		
		double result1 = cal.areaRectagle(10);
		double result2 = cal.areaRectagle(234, 5435);
		
		System.out.println(result1);
		System.out.println(result2);
		
		
//		cal.powerOn();
//		
//		//cal.plus(5,6);
//		// 받아올 리턴값에 대한 변수 지정 필요 = "int result"
//		int result = cal.plus(5,6);
//		System.out.println(result);
//
//		int x = 10, y =2;
//		double result1 = cal.divide(x,y);
//		// 받아올 리턴값은 (형을 유지하고 싶다면) 형식에 맞춰서 변수를 지정해줘야 한다.
//		System.out.println(result1);
//
//		cal.show();
//		
//			System.out.println(car1.model);
//		
//		
//		cal.powerOff();
//		
	}

}
