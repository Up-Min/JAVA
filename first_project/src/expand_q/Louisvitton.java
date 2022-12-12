package expand_q;

import java.util.Arrays;

public class Louisvitton implements DataAccess{

	String[] Louisvittongoods = new String[]{"루이비통가방", "루이비통시계", "루이비통모자","루이비통사람"};
	
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
		for(int i=0; i<Louisvittongoods.length; i++) {
			if(b.equals(Louisvittongoods[i])) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void time() {
		System.out.println("\nLOUISVITTON 매장의 대기 시간은 55분 입니다.");
		System.out.println("현재 판매하는 제품의 상세 정보를 알고 싶다면 1번, 다른 매장을 확인하고 싶다면 2번을 눌러주세요.");
		System.out.print("선택 : ");
	}

	@Override
	public void sales() {
		System.out.println("\nLOUISVITTON 매장의 제품입니다. : " + Arrays.toString(Louisvittongoods));
	}

	@Override
	public void vipwating() {
		System.out.println("===== VIP고객님의 매장 방문을 환영합니다 =====");
		System.out.println("LOUISVITTON 매장의 대기 시간은 5분 입니다. 입장 도와드리겠습니다. \n");	
	}

}
