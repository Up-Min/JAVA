package Test_11_9th;

import java.util.Scanner;

public class Keycontrol_ex {

	public static void main(String[] args) {
		// 1,2 입력시 속도 증가, 감속, 3입력시 종료

		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {

			System.out.println("1.가속, 2.감속, 3.중지");
			System.out.println("선택 : ");
			System.out.println("------------");
			int a = sc.nextInt();
			
			if(a==1) {
				speed++;
				System.out.println("속도 : " + speed);
				System.out.println("선택 : ");
				System.out.println();
			}
			else if(a==2) {
				speed--;
				System.out.println("속도 : " + speed);
				System.out.println("선택 : ");
				System.out.println();
			}
			else if(a==3) {
				System.out.println("중지합니다");
				break; //반복문을 중단시키는 break; 
				//continue; // 다시 반복문으로 돌려버리는 continue (break와 중복 안됨)
			}
			
		}
		sc.close();
	}

}
