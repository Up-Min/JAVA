package test_12_2nd_sync;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	
	// 1. add sync at method
	public void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); 
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() +":"+ this.memory);
	}
	// 2. add sync at code block (Can set code range)
	public void setMemory2(int memory) {
//		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000); 
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() +":"+ this.memory);

//		}
	
	}
	
}
