package test_11_10th;

public class Array_Multi_ex {

	public static void main(String[] args) {

		// 다차원 배열
		int[][] score = { { 80, 90, 95 }, { 86, 56 } };

		int[][] mathScores = new int[3][3];

		mathScores[0][2] = 3;

		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println(mathScores[i][j]);
			}
		}

//		System.out.println("1차원 배열 길이 " + score.length);
//		System.out.println("2차원 1번항 배열 길이 " + score[0].length);
//		System.out.println("2차원 2번항 배열 길이 " + score[1].length);
//
//		// 1번째 인덱스의 3번째 항목 숫자 출력
//		System.out.println(score[0][2]);
//
//		// 2번째 인덱스의 2번째 항목 숫자 출력
//		System.out.println(score[1][1]);
//
//		// 1번째 인덱스의 평균값 구하는 식
//		int sum = 0;
//		for (int i = 0; i < score[0].length; i++) {
//			sum += score[0][i];
//		}
//		double avr = (double) (sum / score[0].length);
//		System.out.println(avr);
//
//		// 2차원 배열의 전체 평균점수 구하는 방법
//		int totalSum = 0;
//		int totalStudent = 0;
//
//		for (int i = 0; i < score.length; i++) {
//			totalStudent += score[i].length; // 전체 학생의 숫자 (배열 데이터의 갯수 가져옴)
//			for (int j = 0; j < score[i].length; j++) {
//				totalSum += score[i][j];
//			}
//		}
//		double avg = (double) (totalSum / totalStudent);
//		System.out.println(avg);
//
	}
}
