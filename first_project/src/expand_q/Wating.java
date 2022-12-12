package expand_q;

import java.util.Scanner;

public class Wating {
	public static void time(DataAccess da) {da.time();}

	public static void sale(DataAccess da) {da.sales();}

	Scanner sc = new Scanner(System.in);

	public Wating(int a) {
		Gucci b = new Gucci();
		Channel c = new Channel();
		Louisvitton d = new Louisvitton();
		Bvlgari e = new Bvlgari();
		
		if (a == 0) {
			VIPaccess.VIPaccess1();
		} else if (a == 1) {
			time(new Gucci());
			int f = sc.nextInt();
			b.sel(f);
		} else if (a == 2) {
			time(new Channel());
			int f = sc.nextInt();
			c.sel(f);
		} else if (a == 3) {
			time(new Louisvitton());
			int f = sc.nextInt();
			d.sel(f);
		} else if (a == 4) {
			time(new Bvlgari());
			int f = sc.nextInt();
			e.sel(f);
		} else if (a == 5) {
			System.out.print("찾으시는 제품 선택 : ");
			String ss = sc.nextLine();
			new FindGoods(ss);
		}
	}
}
