package Test_11_9th;

public class Overflow_Underflow {

	public static void main(String[] args) {
		byte var1 = 125; // byte : -128~127
		for (int i = 0; i < 5; i++) {
			var1++;
			System.out.println("var1 : " + var1);
			// 127까지만 표현할 수 있는 byte, 그 이상 넘어가면 오버플로우로 -값이 나오게 됨.
			// overflow - 타입이 허용하는 최대값을 벗어나는 것.
		}
		System.out.println("-------------------------");
		byte var2 = -125;
		for (int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2 : " + var2);
		}
		// underflow 발생. 타입이 허용하는 최솟값을 벗어나는 것.
	}
}
