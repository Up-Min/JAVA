package test_11_24th_system;

public class ExitEx {

	public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				// process finish.
				System.out.println("종료");
				System.exit(0);
				// exit 0 : normally finish.
				// exit 1,-1 : abnormally finish.
			}
		}

	}

}
