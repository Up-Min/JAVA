package expand_q;

import java.util.Arrays;

public class Gucci implements DataAccess{

	String[] Guccigoods = new String[]{"구찌백", "구찌소파", "구찌옷","구찌시계","구찌염따"};
	
	public void sel(int a) {
		switch (a) {
		case 1:
			sales();
			break;
		default:
			System.out.println("잘못된 선택입니다. 초기메뉴로 돌아갑니다.");
			break;
		}
	}
	
	public boolean find(String b) {
		for(int i=0; i<Guccigoods.length; i++) {
			if(b.equals(Guccigoods[i])) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void time() {
		System.out.println("\nGUCCI 매장의 대기 시간은 1시간 30분 입니다.");
		System.out.println("현재 판매하는 제품의 상세 정보를 알고 싶다면 1번, 다른 매장을 확인하고 싶다면 2번을 눌러주세요.");
		System.out.print("선택 : ");	
	}

	@Override
	public void sales() {
		System.out.println("\nGUCCI 매장의 제품입니다. : " + Arrays.toString(Guccigoods));
	}
	@Override
	public void vipwating() {
		System.out.println("===== VIP고객님의 매장 방문을 환영합니다 =====");
		System.out.println("GUCCI 매장의 대기 시간은 8분 입니다. 저희 GUCCI 매장 방문을 환영합니다. \n");	
	}
}
