package data;
import data.*;
import game.*;
import setting.*;

public class Tire {
	private static String nowTire = "슬릭타이어";
	public Tire() {
	}
	
	public void tire_Clear() {
		if(Weather.getWeather() == Define.WEATHER_CLEAR) {
			if(getNowTire().equals("슬릭타이어")) {
				Car.TireCarSpeed(1);
			}else if (getNowTire().equals("인터미디애트 타이어")) {
				Car.TireCarSpeed(0.6);				
			}
		}
	}
	public void tire_Rainy() {
		if (Weather.getWeather() == Define.WEATHER_RAINY) {
			if(getNowTire().equals("슬릭타이어")) {
				Car.TireCarSpeed(0.8);
			}else if (getNowTire().equals("인터미디애트 타이어")) {
				Car.TireCarSpeed(0.3);				
			}
		}
	}
	public void tirePunture() {
		Car.TireCarSpeed(0);
		Situation.alertPunture();
	}
	public String getNowTire() {
		return nowTire;
	}
	public void setNowTire(int nowTire) {
		if(nowTire == 1) {
			this.nowTire = "슬릭타이어";
		}else if (nowTire == 2) {
			this.nowTire = "인터미디애트 타이어";
		}
	}
}

