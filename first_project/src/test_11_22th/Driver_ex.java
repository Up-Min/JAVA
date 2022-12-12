package test_11_22th;

public class Driver_ex {

	public static void main(String[] args) {
		Driver dr = new Driver();
		
		Bus_ bu = new Bus_();
	// 매개변수를 vehicle로 받아서, bus가 실행되는 순간 
	// void driver(Vehicle_ vh = new Bus_()) -> 결국 자동형변환이 실행 됨.
	// 이후 Bus_안에 있는 "버스 달린다" 가 나오게 됨.
		Taxi_ tx = new Taxi_();
		
		dr.driver(bu);
		dr.driver(tx);

	}

}
