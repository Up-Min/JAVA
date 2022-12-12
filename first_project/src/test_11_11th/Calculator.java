package test_11_11th;

import java.util.Scanner;

public class Calculator {
	
	// 메소드 오버로딩 : 같은 이름의 메소드 여러개를 만든다.
	// 왜 필요할까? 같은 input으로 다른 결과값을 내야할 때! (직사각형, 정사각형) 사용할 수 있음.
	// 생성자 오버로딩과 동일하게, 매개변수의 순서, 타입, 갯수중 하나라도 달라야한다!
	
	double areaRectagle(double width) { //정사각형의 넓이를 구하는 방식
		return width*width;
	}
	
	// 타입이 달라지는 두번째 areaRectagle. 그래서 매개변수를 다르게 줌.
	double areaRectagle(double width, double height) { //직사각형의 넓이를 구하는 방식
		return width*height;
	}
	
	
	
//
//	Scanner sc = new Scanner(System.in);
//	
//	//리턴값이 없는 메소드 만들기
//	void powerOn() {
//		System.out.println("전원을 켭니다.");
////		return 0; // return0 선언시 에러 뜸.
//		return; // 아니면 생략도 가능
//	}
//	void powerOff() {
//		System.out.println("전원을 끕니다.");
//	}
//
//	// int형으로 리턴값이 나오는 메소드
//	int plus(int x, int y) {
//		int result = x + y;
//		return result; //리턴값이 없을 경우 에러가 뜸. 
//	}
//	
//	// double형으로 리턴값이 나오는 메소드
//	double divide (int x, int y) {
//		double result = (double)(x/y);
//		return result;
//	}
//	
//	void show() {
//		String id = sc.next();
//		int a=0;
//		for(int i=0; i<id.length(); i++) {
//			a += i;
//		}
//		System.out.println("void show에서 인식 된 string의 길이는 "+a);
//	}
	
}
