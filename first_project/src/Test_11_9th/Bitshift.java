package Test_11_9th;

public class Bitshift {

	public static void main(String[] args) {
		// 비트 이동 연산자

		int num1 = 1;
		int result1 = num1 << 3;
		System.out.println(result1);
		/* 왜 8? 2진수 기준 우측에 3칸을 0으로 채우게 됨.
		 *  0001 -> 1000 으로 바뀌니까 나온 값이 8이 되는거
		 *  1*2의 3승 = 8 (곱하기)
		 *  */
		
		int num2 = -8;
		int result2 = num2 >> 3;
		System.out.println(result2);
		/* 왜 -1? 2진수 기준 좌측의 3칸을 0으로 채우게 되니까
			1111111111111111000 에서 1111111111111111111이 되어버리니까
			-8이 -1이 되는거
			-8/2의 3승 = -1 (나누기)
		 */
		
	}

}
