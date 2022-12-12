package test_11_23th;

public class Anonymous_ex {

	public static void main(String[] args) {
		Anonymous anoy = new Anonymous();

		anoy.field.run();
		anoy.method1();
		anoy.method2(new vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});

	}

}
