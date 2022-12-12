package test_12_2nd_mainthread;

import java.awt.Toolkit;

public class BeepPrintEx4 extends Thread{

	// override run (actual thread activate)
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();			
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
	public static void main(String[] args) {
		// activate overrided run
		Thread th = new BeepPrintEx4();
		th.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5sec wait 
			} catch (Exception e) {
			}
		}
		
	}

}
