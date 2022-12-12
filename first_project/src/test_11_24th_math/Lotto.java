package test_11_24th_math;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// chosen number (I selected)
		
		// Array will save lotto 6 numbers
		int[] selectNumber = new int [6];
		Random rand = new Random(1);
		System.out.print("선택 번호 : ");
		for(int i= 0; i<6; i++) {
			selectNumber[i] = rand.nextInt(45)+1;
							// to pick 1~45 range number
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		
		// Lotto number (from computer)
		int[] winNumber = new int [6];
		Random rand1 = new Random(11);
		System.out.print("당첨 번호 : ");
		for(int i= 0; i<6; i++) {
			winNumber[i] = rand1.nextInt(45)+1;
							// to pick 1~45 range number
			System.out.print(winNumber[i] + " ");
		}
		System.out.println();
		
		
		
		// check WIN
		Arrays.sort(selectNumber); // arrays Array number before compare.
		Arrays.sort(winNumber);
		
		int resval = 0;
		for(int i=0; i<selectNumber.length; i++) {
			if(selectNumber[i] == winNumber[i]) {
				resval ++;
			}
		}
		
		switch (resval) {
		case 6:
			System.out.println("1등입니다!");
			break;
		case 5:
			System.out.println("2등입니다!");
			break;
		case 4:
			System.out.println("3등입니다!");
			break;
		case 3:
			System.out.println("4등입니다!");
			break;
		case 2:
			System.out.println("5등입니다!");
			break;
		case 1:
			System.out.println("6등입니다!");
			break;
		case 0:
			System.out.println("당첨이 아닙니다");
			break;
		}
//		boolean result = Arrays.equals(selectNumber, winNumber);
//		if(result == true) {
//			System.out.println("당첨입니다");
//		}else {
//			System.out.println("당첨이 아닙니다");
//		}
		

	}

}
