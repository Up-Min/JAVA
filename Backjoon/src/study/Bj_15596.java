package study;

public class Bj_15596 {

	
	static long sum (int[] a) {
		long ans = 0;
		for (int i=0; i<a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		int[] a = {};
		
		System.out.println(sum(a));
		

	}

}
