package expand_q;

import java.util.Scanner;

public class VIPaccess {

	public static void vipwating(DataAccess da) { da.vipwating();}
	public static void sale(DataAccess da) {da.sales();}

	public static void VIPaccess1() {
		Gucci b = new Gucci();
		Channel c = new Channel();
		Louisvitton d = new Louisvitton();
		Bvlgari e = new Bvlgari();
		Scanner sc = new Scanner(System.in);

		boolean l = true;
		try {
			outerLoop: while (l) {
				System.out.println("===== VIP 고객님의 방문을 환영합니다 =====");
				System.out.println("방문을 원하시는 매장을 선택해주세요.");
				System.out.println("0.매장 입점 물품 확인 1.GUCCI 2.CHANNEL 3.LOUISVITTON 4.BVLGARI 5.상단메뉴이동");
				System.out.print("방문 매장 선택 : ");
				int a = sc.nextInt();
				System.out.println("");
				switch (a) {
				case 0:
					System.out.println("===== VIP 고객님을 위한 입점물품 리스트입니다. =====");
					sale(b);
					sale(c);
					sale(d);
					sale(e);
					System.out.println("");
					continue outerLoop;
				case 1:
					vipwating(b);
					continue outerLoop;
				case 2:
					vipwating(c);
					continue outerLoop;
				case 3:
					vipwating(d);
					continue outerLoop;
				case 4:
					vipwating(e);
					continue outerLoop;
				case 5:
					break outerLoop;
				default:
					System.out.println("잘못된 입력입니다. 다시 선택해주세요. \n");
					continue outerLoop;
				}
			}
		} catch (Exception e2) {
			System.out.println("숫자를 입력해주세요.");
			System.out.println("");
			VIPaccess1();
		}


	}
}
