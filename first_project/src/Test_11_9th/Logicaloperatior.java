package Test_11_9th;

public class Logicaloperatior {

	public static void main(String[] args) {
		// 논리연산자

		int charCode = '0';

		if ((65 <= charCode) & (charCode <= 90)) {
			System.out.println("대문자임");
		}
		if ((97 <= charCode) && (charCode <= 122)) {
			System.out.println("소문자임");
		}
		if ((48 <= charCode) & (charCode <= 57)) {
			System.out.println("숫자임");
		}
		// && - 앞에 피연산자가 false면 뒤에거를 계산하지 않음, & - 일단 둘 다 계산해봄
		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2또는 3의 배수");
		}
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2또는 3의 배수");
		}
		// ||,| -> 얘도 위에랑 유사함

	}
}
