package expand_q;

import java.util.Scanner;

public class WatiingApp {

	public static void time(DataAccess da) {da.time();}
	public static void sale(DataAccess da) {da.sales();}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		outerloop : while (b) {
			try {
				System.out.println("");
				System.out.println("===== 명품매장 웨이팅 확인 & 입점 물품 확인 앱 =====");
				System.out.println("확인하고 싶은 명품 매장을 골라주세요.");
				System.out.println("0.VIP고객 방문 1.GUCCI 2.CHANNEL 3.LOUISVITTON 4.BVLGARI 5.제품매장찾기 6.App 종료");
				System.out.print("매장 선택 : ");
				int a = sc.nextInt();
				System.out.println("");
				if (a == 6) {
					System.out.println("===== App 종료 =====");		
					break outerloop;
				}else {
				 new Wating(a);
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
				main(args);
			}
			
		}
	}
}
