package Test_11_9th;

public class Acc {

	public static void main(String[] args) {
		//정수 연산
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		
//		double result = apple - number * pieceUnit;
//		System.out.println(result);
		//1 - 0.7(연산자 우선순위에 근거) = 0.3이 나와야하는데 좀 적게 나온다?
		// 자바에서는 연산을 할 때, 정확한 계산은 항상 정수로 해야한다.

// 개선버전
//		int apple = 1;
//		int pieceUnit = apple * 10;
//		int number = 7;
//		int result = pieceUnit-number;
//		System.out.println(result/10.0);
		// 마지막 연산에서 실수형태로 나눠줌.
	
		int x = 5;
		double y = 0.0;
		double result = x/y; //int시 예외 에러 발생 (무한대의 값을 표현할 수 없어짐)
		System.out.println(result+2); //double형으로 할 시 infinity로 나옴
		
		if (Double.isFinite(result) || Double.isNaN(result)) {
			System.out.println("result unavailable");
		}else {
			System.out.println(result);
		}
	}
}
