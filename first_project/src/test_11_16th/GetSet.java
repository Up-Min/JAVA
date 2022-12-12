package test_11_16th;

public class GetSet {

	private int speed;
	private boolean stop;
	
	
	// 자동으로 getter과 setter을 생성해주는 제너레이터 사용
	//우클릭
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			this.speed = 0;
		}
	}


	
	
	
	
	
	
	// private에 접근할 수 있게 해주는 get, set설정 
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	public int getSpeed() {
//		return speed;
//	}


	
}
