package java_modeling_11_29_set;

// 합성관계
public class Computer {
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private Powersupply p;
	
	public Computer() {
		this.mb = new MainBoard();
		this.c = new CPU();
		this.m = new Memory();
		this.p = new Powersupply();	
	}
	

	
}
