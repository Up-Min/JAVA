package test_11_28th;

public class Student {
	static String name;
	static int ban;
	static int no;
	static int kor=86;
	static int eng=70;
	static int math=100;
	
	
	
	@Override
	public String toString() {
		return name + Integer.toString(ban) + Integer.toString(no); 
	}

	public static int getTotal() {
		int total = kor + eng + math;
		System.out.println(total);
		return total;
	} 
	
	public static float getAverage() {
		float avr = ((kor + eng + math)/3f);
		float res = ((float)(Math.round(avr*100))/100);
		return res;
	}





}
