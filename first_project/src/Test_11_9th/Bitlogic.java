package Test_11_9th;

public class Bitlogic {

	public static void main(String[] args) {
		// 비트연산자

		System.out.println("45&25 = " + (45 & 25));
		System.out.println("45|25 = " + (45 | 25));
		System.out.println("45^25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("---------------------------");

		/**
		 * & - and / | - or / ^ - xor / ~ - not 보수 (완전 반대수) 45, 25의 2진수를 연산 수행하여 나온 값을
		 * 출력시킴
		 *
		 */

		// 쓰임새
		byte recieveData = -128;
		int unsignedint = Byte.toUnsignedInt(recieveData);
		System.out.println(unsignedint);

	}

}
