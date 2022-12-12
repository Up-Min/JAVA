package Test_11_9th;

public class IF_ex {

	public static void main(String[] args) {
		// 조건문

//		int score = 85;
//		if(score >= 90) {
//			System.out.println("90점 이상입니다.");
//		} else {
//			System.out.println("90점 미만입니다.");
//		}

		int num = (int) (Math.random() * 6) + 1; // 주사위 번호를 뽑기위해 *6, +1을 해줌.
//		if (num == 1) {
//			System.out.println("1번");
//		} else if (num == 2) {
//			System.out.println("2번");
//		} else if (num == 3) {
//			System.out.println("3번");
//		} else if (num == 4) {
//			System.out.println("4번");
//		} else if (num == 5) {
//			System.out.println("5번");
//		} else if (num == 6) {
//			System.out.println("6번");
//		}
		// 랜덤함수 자체는 0.0~1.0사이만 나옴.
		// int로 cast를 해줘야함.

		// byte, char, short, int, long
		// string 까지 switch에 사용할 수 있음
		switch (num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
		}

	}

}
