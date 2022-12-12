package review_11_19th;

public class Interface_Child extends Interface_Parent{
	static final int overspeed = 200;
	static final int speed = 100;
	
	int nowspeed = speed;

	@Override
	public void speedUp() {
		if(nowspeed == overspeed) {
			System.out.println("속도를 200.");
		}else
		super.speedUp();
	}
	

	
}
