package test_11_22th;

public class Bus implements Vehicle{
	// vehicle 상속 받음
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금 체크.");
	}
	
}
