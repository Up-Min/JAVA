package data;

public class Fuel {
	Car C = new Car();
	
	private int FuelLevel = 100;
	
	public Fuel() {
	}
	
	public void FuelRecharge(int recharge) {
		System.out.println("기름을 " + recharge + " % 만큼 보충합니다.");
		this.FuelLevel = recharge;
	}
	
	public void FuelUse(int use) {
		this.FuelLevel -= use;
		System.out.println("기름 " + use + "% 만큼 소비.");
	}

	public int getFuelLevel() {
		return FuelLevel;
	}
	
	public void FuelZero() {
		if(getFuelLevel() == 0) {
			C.setCarSpeed(0);
		}
	}
}
