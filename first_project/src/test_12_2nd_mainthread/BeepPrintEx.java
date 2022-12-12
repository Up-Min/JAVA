package test_12_2nd_mainthread;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// class can make 'beep' sound.
		
		for(int i=0; i<5; i++) {
			toolkit.beep(); // sounds beep
			try {
				Thread.sleep(500); // 0.5sec wait 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5sec wait 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
		// want to sounds beep and print "띵" at same times -> use multi thread.
		

	}

}
