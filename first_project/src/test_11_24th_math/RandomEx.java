package test_11_24th_math;

public class RandomEx {
	//Math.random
	
	public static void main(String[] args) {
		// printout 0.0 ~ 1.0 (double type)
		System.out.println(Math.random());
		
		int n = 9; // n integer -> 9times integer.
		int start = 1; // starting number. 
		int num = (int) (Math.random() * n) + start;
		// num range : 1~9 
		
		System.out.println(num);
		
		
	}

}
