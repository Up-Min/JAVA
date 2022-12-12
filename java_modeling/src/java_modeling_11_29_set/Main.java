package java_modeling_11_29_set;

public class Main {

	public static void main(String[] args) {
		// 합성관계
		Computer com = new Computer();
		com = null;
		// when declare Computer. bm, c, m, p also creating.
		// if declared Computer deleted. bm, c, m, p also delete.
			
		
		// 집약관계
		MainBoard mb = new MainBoard();
		CPU c = new CPU();
		Memory m = new Memory();
		Powersupply p = new Powersupply();	
		
		Computer2 c2 = new Computer2(mb, c, m, p);
		c2=null;
		// even if declared Comnputer2 deleted. bm,c,m,p still alive
	}

}
