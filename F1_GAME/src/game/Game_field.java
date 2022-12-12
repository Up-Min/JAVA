package game;

import java.util.Scanner;

import data.*;
import setting.Define;

public class Game_field {
	Fuel F = new Fuel();
	Tire T = new Tire();
	Situation S= new Situation();
	Car C = new Car();
	Scanner sc = new Scanner(System.in);
	Map M = new Map();
	
	public int Turn = 0;
	public int PuntureTurn = 0;
	public boolean game_status = true;
	int defaultWeather = Define.WEATHER_CLEAR;
	int currentLap = 0;
	
	
	public Game_field() {
		while (game_status) {
			while(currentLap<= M.getMapLength()) {
				T.tire_Clear();
				int tp = (int)(Math.random()*100);
				if (tp<6) {
					Punture();
				}
			}			
		}
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

	public void Weather() {
		if(defaultWeather == Define.WEATHER_CLEAR) {
			T.tire_Clear();
		}
		if(defaultWeather == Define.WEATHER_RAINY) {
			S.alertRain();
			T.tire_Rainy();
			}
	}
	
//	public void Turn() {
//		currentLap += C.getCarSpeed(); 
//		int d = (int)(Math.random()*100);
//		if(d<60) {
//			
//		}
//		Turn ++;
//	}
}
