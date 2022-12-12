package expand_q;

import java.util.Arrays;

public class Channel extends Gucci implements DataAccess{

	
	String[] Channelgoods = new String[]{"샤넬백", "샤넬벨트", "샤넬구두","샤넬향수"};
	
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
		for(int i=0; i<Channelgoods.length; i++) {
			if(b.equals(Channelgoods[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void time() {
		System.out.println("\nCHANNEL 매장의 대기 시간은 1시간 20분 입니다.");
		System.out.println("현재 판매하는 제품의 상세 정보를 알고 싶다면 1번, 다른 매장을 확인하고 싶다면 2번을 눌러주세요.");
		System.out.print("선택 : ");
	}

	@Override
	public void sales() {
		System.out.println("\nCHANNEL 매장의 제품입니다. : " +  Arrays.toString(Channelgoods));
	}

	@Override
	public void vipwating() {
		System.out.println("===== VIP고객님의 매장 방문을 환영합니다 =====");
		System.out.println("CHANNEL 매장의 대기 시간은 10분 입니다. \n");	
	}
}
