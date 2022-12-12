package test_11_14th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Account {

	// 22번 문제
//	static final int MIN_BALANCE = 0;
//	static final int MAX_BALANCE = 1000000;
//	
//	private int balance = 0;
//	
//	void setBalance(int Setter){
//		if(Setter<MIN_BALANCE) {
//			balance += 0;
//			return;
//		}else if(Setter>MAX_BALANCE) {
//			balance += 0;
//			return;
//		}
//		balance = Setter;
//	}
//	
//	int getBalance() {
//		int Getter = balance;
//		return Getter;
//	}

	// 23번 문제

	static String AccNum;
	static String AccName;
	static String AccMoney;
	static int j = 0;

	static String[] Acc = new String[0];
	List<String> list = new ArrayList<>(Arrays.asList(Acc));

	void CreateAccount(String number, String name, String money) {
		AccNum = number;
		AccName = name;
		AccMoney = money;
		

		list.add(AccNum);
		list.add(AccName);
		list.add(AccMoney);

		Acc = list.toArray(Acc);
		System.out.println(Arrays.toString(Acc));
	}
	// 계좌목록
	void AccountList() {
		for (int i = 1; i < Acc.length - 1; i = i+3) {
			if (i == 1) {
				System.out.print(Acc[i - 1] + " ");
				System.out.print(Acc[i] + " ");
				System.out.println(Acc[i + 1]);
			} else {
				System.out.print(Acc[i-1] + " ");
				System.out.print(Acc[i] + " ");
				System.out.println(Acc[i+1]);
			}

		}
	}
	// 계좌입금
	void AccountInput(String number, int money) {
		for (int i = 0; i < Acc.length - 1; i++) {
			if (number.matches(Acc[i])) {
				int Val = Integer.parseInt(Acc[i + 2]);
				Val += money;
				Acc[i + 2] = Integer.toString(Val);
				System.out.println("잔액 : " + Acc[i + 2]);
				break;
			}
		}
	}
	// 계좌출금
	void AccountOutput(String number, int money) {
		for (int i = 0; i < Acc.length - 1; i++) {
			if (number.matches(Acc[i])) {
				int Val = Integer.parseInt(Acc[i + 2]);
				Val -= money;
				Acc[i + 2] = Integer.toString(Val);
				System.out.println("잔액 : " + Acc[i + 2]);
				break;
			}
		}
	}

}
