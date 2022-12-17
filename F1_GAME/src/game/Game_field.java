package game;

import java.util.Scanner;
import data.*;
import setting.Define;

public class Game_field {
	static Scanner sc = new Scanner(System.in);
	static Fuel F = new Fuel();
	static Tire T = new Tire();
	static Situation S= new Situation();
	static Car C = new Car();
	static Map M = new Map();
	static Weather W = new Weather();
	
	public int Turn = 0;
	public int PuntureTurn = 0;
	public boolean game_status = true;
	int defaultWeather = Define.WEATHER_CLEAR;
	int currentLap = 0;
	
	
//	public Game_field() {
//		while (game_status) {
//			while(currentLap<= M.getMapLength()) {
//				T.tire_Clear();
//				int tp = (int)(Math.random()*100);
//				if (tp<6) {
//					Punture();
//				}
//			}			
//		}
//	}
	
	
	public void gameIntro() {
		System.out.println("===== F1 게임 =====");
		System.out.println("==== 플레이를 원하시면 1번을 눌러주세요 ====");
		int a = sc.nextInt();
		if(a == 1) {
			selectMap();
		}else {
			System.out.println("====== 플레이를 원치 않으므로 게임을 종료합니다. ======");
		}
	}
	
	public void selectMap() {
		Map m1 = new Map ("아부다비", 1600);
		Map m2 = new Map ("런던", 2000);
		
		System.out.println("===== 플레이 하실 맵을 선택해주세요 =====");
		System.out.println("1. 아부다비 2. 런던");
		int b = sc.nextInt();
		if(b==1) {
			System.out.println("맵 이름은 "+m1.getMapname() + "입니다.");
			System.out.println("총 길이는 "+m1.getMapLength() + "km 입니다.");
		}else if (b==2) {
			System.out.println("맵 이름은 "+m2.getMapname() + "입니다.");
			System.out.println("총 길이는 "+m2.getMapLength() + "km 입니다.");
		}
	}
	
	public void setWeather() {
		System.out.println("========== 날씨를 지정해주세요 ==========");
		System.out.println("1.맑음 2.흐림 3.비");
		int b = sc.nextInt();
		if(b == 1) {
			weatherClear();
		}else if (b==2) {
			weatherCloudy();
		}else if (b==3) {
			weatherRainy();
		}
	}
	public void weatherClear() {
		W.setWeather(Define.WEATHER_CLEAR);
		T.tire_Clear();
		System.out.println("맑음 날씨를 선택하셨습니다");
		System.out.println("슬릭타이어 속도는 100%, 비용타이어는 60%의 속도를 냅니다.");
	}
	public void weatherCloudy() {
		W.setWeather(Define.WEATHER_CLOUDY);
		T.tire_Clear();
		System.out.println("흐림 날씨를 선택하셨습니다");
		System.out.println("슬릭타이어 속도는 100%, 비용타이어는 60%의 속도를 냅니다.");
	}
	public void weatherRainy() {
		W.setWeather(Define.WEATHER_RAINY); 
		T.tire_Rainy();
		System.out.println("비 날씨를 선택하셨습니다");
		System.out.println("슬릭타이어 속도는 30%, 비용타이어는 80%의 속도를 냅니다.");
	}
	
	public void Game_Start() {
		if(F.getFuelLevel() == 0) {
			game_status = false;
			System.out.println("기름 부족으로 게임에서 리타이어 했습니다.");
		}
		if(PuntureTurn == 3) {
			game_status = false;
			System.out.println("타이어 펑크로 게임에서 리타이어 했습니다.");
		}
		
	}
	
	
	public static void pitIn() {
		System.out.println("========= 피트인 준비중... ==========");
		System.out.println("=== Tip. 비가 올 때는 슬릭타이어가 오히려 더 느립니다. ===");		
		System.out.println("1. 기름 보충 2. 타이어 변경 3.둘 다 진행");
		int b = sc.nextInt();
		if(b==1) {
			System.out.println("====== 기름 보충 ======");
			System.out.println("현재 기름의 양은 " + F.getFuelLevel() + "% 입니다.");
			System.out.println("====== 몇 %만큼 보충하시겠습니까? ======");
			int c = sc.nextInt();
			if(c>=0 && c<=100) {
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
				T.setNowTire(1);
				System.out.println("현재 타이어는 " + T.getNowTire() + "입니다.");
			}else if (c==2) {
				T.setNowTire(2);
				System.out.println("현재 타이어는 " + T.getNowTire() + "입니다.");
			}else {
				System.out.println(" 타이어를 다시 선택해주세요. ");
			}
			
		}else if (b==3) {
			System.out.println("====== 기름 보충 && 타이어 교체 ======");
			System.out.println("");
			System.out.println("현재 기름의 양은 " + F.getFuelLevel() + "% 입니다.");
			System.out.println("====== 몇 %만큼 보충하시겠습니까? ======");
			int c = sc.nextInt();
			if(c>=0 && c<=100) {
				F.FuelRecharge(c);
			}else {
				System.out.println("잘못된 값 입력. 다시 입력하세요.");
			}
			System.out.println("====== 타이어 교체 ======");
			System.out.println("현재 타이어는 " + T.getNowTire() + "입니다.");
			System.out.println("====== 무엇으로 교체하시겠습니까? ======");
			System.out.println("1. 슬릭타이어 2.인터미디애트 타이어");
			int d = sc.nextInt();
			if(d == 1) {
				T.setNowTire(1);
				System.out.println("현재 타이어는 " + T.getNowTire() + "입니다.");
			}else if (d==2) {
				T.setNowTire(2);
				System.out.println("현재 타이어는 " + T.getNowTire() + "입니다.");
			}else {
				System.out.println(" 타이어를 다시 선택해주세요. ");
			}
		}else {
			System.out.println("잘못된 선택입니다. 다시 진행하세요.");
		}
		System.out.println("======== 피트인 종료 =========");
	}
	
	public void Punture() {
		PuntureTurn = 0;
		T.tirePunture();
		if(PuntureTurn < 3) {
			S.alertPunture();
			PuntureTurn ++;
		}
		if(PuntureTurn == 3) {
			game_status = false;
			System.out.println("타이어 펑크로 게임에서 리타이어 했습니다.");
		}
	}

	
	

}
