package data;

import java.util.Scanner;

import setting.Define;

public class PitIn {
	
	Fuel F = new Fuel();
	Tire T = new Tire();
	Situation S= new Situation();
	Car C = new Car();
	Scanner sc = new Scanner(System.in);
	
	
	public PitIn() {
		System.out.println("========= 피트인 준비중... ==========");
		System.out.println("1. 기름 보충 2. 타이어 변경 3.둘 다 진행");
		int b = sc.nextInt();
		if(b==1) {
			System.out.println("====== 기름 보충 ======");
			System.out.println("현재 기름의 양은 " + F.getFuelLevel() + "% 입니다.");
			System.out.println("====== 몇 %만큼 보충하시겠습니까? ======");
			int c = sc.nextInt();
			if(c>=1 && c<=100) {
				F.FuelRecharge(c);
			}else {
				System.out.println("잘못된 값 입력. 다시 입력하세요.");
			}
				
		}else if (b==2) {
			System.out.println("====== 타이어 교체 ======");
			System.out.println("현재 타이어는 " + T.getNowTire() + "입니다.");
			System.out.println("====== 무엇으로 교체하시겠습니까? ======");
			System.out.println("1. 슬릭 타이어 2.인터미디애트 타이어");
			int c = sc.nextInt();
			if(c == 1) {
				T.setNowTire(Define.SLICK_TIRE);
			}else if (c==2) {
				T.setNowTire(Define.INTERMEDIATE_TIRE);
			}else {
				System.out.println(" 타이어를 다시 선택해주세요. ");
			}
			
		}else if (b==3) {
			System.out.println("====== 기름 보충 && 타이어 교체 ======");
			System.out.println("");
			System.out.println("현재 기름의 양은 " + F.getFuelLevel() + "% 입니다.");
			System.out.println("====== 몇 %만큼 보충하시겠습니까? ======");
			int c = sc.nextInt();
			if(c>=1 && c<=100) {
				F.FuelRecharge(c);
			}else {
				System.out.println("잘못된 값 입력. 다시 입력하세요.");
			}
			System.out.println("====== 타이어 교체 ======");
			System.out.println("현재 타이어는 " + T.getNowTire() + "입니다.");
			System.out.println("====== 무엇으로 교체하시겠습니까? ======");
			System.out.println("1. 슬릭 타이어 2.인터미디애트 타이어");
			int d = sc.nextInt();
			if(d == 1) {
				T.setNowTire(Define.SLICK_TIRE);
			}else if (d==2) {
				T.setNowTire(Define.INTERMEDIATE_TIRE);
			}else {
				System.out.println(" 타이어를 다시 선택해주세요. ");
			}
			
		}else {
			System.out.println("잘못된 선택입니다. 다시 진행하세요.");
		}
		System.out.println("======== 피트인 종료 =========");
	}
}
