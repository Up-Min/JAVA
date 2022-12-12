package data;

import game.*;
import setting.*;

public class Tire {
	private int nowTire = Define.SLICK_TIRE;
	Car c = new Car();
	Weather w = new Weather();
	Situation s = new Situation();
	
	public Tire() {
	}
	
	public void tire_Clear() {
		if(w.getWeather() == Define.WEATHER_CLEAR) {
			if(getNowTire() == Define.SLICK_TIRE) {
				c.TireCarSpeed(1);
			}else if (getNowTire() == Define.INTERMEDIATE_TIRE) {
				c.TireCarSpeed(0.6);				
			}
		}
	}
	public void tire_Rainy() {
		if (w.getWeather() == Define.WEATHER_RAINY) {
			if(getNowTire() == Define.INTERMEDIATE_TIRE) {
				c.TireCarSpeed(0.8);
			}else if (getNowTire() == Define.SLICK_TIRE) {
				c.TireCarSpeed(0.3);				
			}
		}
	}
	public void tirePunture() {
		c.TireCarSpeed(0);
		s.alertPunture();
	}
	public int getNowTire() {
		return nowTire;
	}
	public void setNowTire(int nowTire) {
		this.nowTire = nowTire;
	}
}

