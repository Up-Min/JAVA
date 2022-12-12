package test_11_22th;

public class CastEx {

	public static void main(String[] args) {
//		Vehicle vh = new Bus(); // 자동 타입 변환
//		vh.run();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		ride(bus);
		ride(taxi);
	}

	// 메인메소드 밑에 추가
	public static void ride(Vehicle vh) {
		// vh가 Bus 객체를 포함하고 있는가?
		if (vh instanceof Bus) { // 강제타입 변환시 꼭 들어가야하는 instace of
			// 강제타입 변환 드가자
			Bus Bu = (Bus) vh;
			Bu.checkFare(); // 버스에만 있던 승차요금 체크 나옴.
		} else {
			vh.run();
		}
	}

}
