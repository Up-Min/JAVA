package test_11_23th;

public class Anonymous {
	vehicle field = new vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		vehicle localVar = new vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	void method2(vehicle v) {
		v.run();
	}
}
