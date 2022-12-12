package Test_11_9th;

import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 스캐너 선언 + 변수 = 객체 선언 + import한 아이 가져오기 + (System.in)
		System.out.println("x값 입력");
		String strX = scan.nextLine(); // enter 키를 누르는 순간 문자열을 읽는다
		int x = Integer.parseInt(strX);

		System.out.println("y값 입력");
		String strY = scan.nextLine(); // enter 키를 누르는 순간 문자열을 읽는다
		int y = Integer.parseInt(strY);

		int result = x + y;

		System.out.println("입력받은 x+y의 결과 : " + result);

		while (true) {
			System.out.println("입력 문자열 : ");
			String data = scan.nextLine();

			if (data.equals("q")) { // primitive 타입이 아니라 객체형태이기 때문에 char형 처럼 === 으로 할 수 없다. .equals가 있어야 함.
				break;
			}

			System.out.println("출력 문자열 : " + data);
			System.out.println("!!!!!!!!!!!!정해진 값과 다르므로 다시 처음부터!!!!!!!!!!!!");
			System.out.println();
		}
		System.out.println("종료");
	}

}
