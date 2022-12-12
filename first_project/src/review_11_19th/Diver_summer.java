package review_11_19th;

public class Diver_summer extends Diver_normal {

	int a = 0;
		
	
	public Diver_summer(String string, int i) {
		super(string);
		this.a = i;
	}
	
	public void runin() {
		System.out.println("썸머 타이어 작동");
	}
	
	
}
