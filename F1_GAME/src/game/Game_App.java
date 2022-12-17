package game;


import data.*;

import setting.Define;

public class Game_App {

	
	public static void main(String[] args) {
		Game_field G = new Game_field();
		G.gameIntro();
		G.setWeather();
		G.pitIn();
		
	}	
}
