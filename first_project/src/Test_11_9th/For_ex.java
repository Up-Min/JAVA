package Test_11_9th;

public class For_ex {

	public static void main(String[] args) {

		// 누적합계
//		int sum = 0;
//		for (int i = 1; i < 101; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		

//		for (int i = 1, j = 1; i < 10; i++, j++) {
//			// 중간 조건식을 제외한 선언문과 증감문을 두개를 넣을 수 있다
//			System.out.println(i);
//			System.out.println(j);
//		}

		// 이중 for문도 js와 동일함
		for (int i = 2; i < 10; i++) {
			System.out.println("--------------" + i + "단" + "---------------");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}

	}

}
