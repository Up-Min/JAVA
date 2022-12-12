package test_11_14th;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account A = new Account();
		Scanner sc = new Scanner(System.in);

		while (true) {

			String AccNum;
			String AccName;
			String AccMoney;
			int AddMoney;

			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			System.out.println("-------------");

			switch (select) {
			case 1:
				System.out.println("계좌생성");
				System.out.println("-------------");
				System.out.print("계좌번호 :");
				AccNum = sc.next();
				System.out.print("예금주 : ");
				AccName = sc.next();
				System.out.print("초기입금액 : ");
				AccMoney = sc.next();
				
				A.CreateAccount(AccNum, AccName, AccMoney);
				System.out.println("결과 : 계좌가 생성되었습니다.");
				continue;

			case 2:
				System.out.println("계좌목록");
				System.out.println("-------------");
				
				A.AccountList();
				continue;

			case 3:
				System.out.println("예금");
				System.out.println("-------------");
				System.out.print("계좌번호 :");
				AccNum = sc.next();
				System.out.print("예금액 : ");
				AddMoney = sc.nextInt();
				
				A.AccountInput(AccNum, AddMoney);
				continue;

			case 4:
				System.out.println("출금");
				System.out.println("-------------");
				System.out.print("계좌번호 :");
				AccNum = sc.next();
				System.out.print("출금액 : ");
				AddMoney = sc.nextInt();
				
				A.AccountOutput(AccNum, AddMoney);
				continue;

			case 5:
				System.out.println("프로그램 종료");
				System.out.println("-------------");
				break;
				
			default :
				System.out.println("잘못된 선택입니다. 다시 고르세요");
				continue;
			}
			break;

		}

	}

}
