package data;
import data.*;
import setting.Define;

public class Weather {
	private static int weather;
	Tire T = new Tire();
	
	
	public Weather() {}
	
	public void setWeather(int weather) {
		this.weather = weather;
	}
	public static int getWeather() {
		return weather;
	}

}
