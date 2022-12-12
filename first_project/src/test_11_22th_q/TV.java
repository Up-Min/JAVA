package test_11_22th_q;

public class TV implements Remocon{

	@Override
	public void powerOn() {
		System.out.println("TV를 켰어");
	}
	
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}



}
