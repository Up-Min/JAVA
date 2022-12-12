package test_11_17th;
//오오오오 오버라이드
public class Computer_ex {

	public static void main(String[] args) {
		int r = 10;
		Calculator calc = new Calculator();
		System.out.println(calc.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(r));
	}

}
