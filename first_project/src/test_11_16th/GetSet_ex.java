package test_11_16th;

public class GetSet_ex {

	public static void main(String[] args) {
		GetSet gs = new GetSet();

		
		//get, set이용하여 private 변수 접근
		gs.setSpeed(10);
		System.out.println(gs.getSpeed());

		
		if(!gs.isStop()) {//달리고 있을 때
			gs.setStop(true);//멈추게 한다
		}
		System.out.println(gs.getSpeed());
	}

}
