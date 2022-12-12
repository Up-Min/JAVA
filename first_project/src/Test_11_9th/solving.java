package Test_11_9th;


public class solving {

	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i=1;i<9;i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;		
		}
		}
	}

