package data;

import java.util.ArrayList;


public class Map {
	private String Mapname;
	private int MapLength;
	ArrayList<Map> mapArray = new ArrayList<>();
	
	public Map() {
	}
	
	
	public Map(String name, int length) {
		this.Mapname = name;
		this.MapLength = length;
	}


	public String getMapname() {
		return Mapname;
	}


	public int getMapLength() {
		return MapLength;
	}


	public ArrayList<Map> getMapArray() {
		return mapArray;
	}


	public void setMapArray(ArrayList<Map> mapArray) {
		this.mapArray = mapArray;
	}

	

	
	
}
