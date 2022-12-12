package test_12_2nd_mainthread;

import java.awt.Toolkit;

public class BeepPrintEx3 {
		// DO MULTI THREAD - make another thread.
	// want to sounds beep and print "띵" at same times -> use multi thread.
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			//declare thread, add direct runnable interface.
			//runnable : an interface to activate thread
				
			// run() : code runs actual thread.
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Toolkit toolkit = Toolkit.getDefaultToolkit();			
			for(int i=0; i<5; i++) {
				toolkit.beep(); // sounds beep
				try {
					Thread.sleep(500); // 0.5sec wait 
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}});  // main has "띵", thread has .beep
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5sec wait 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		

	}

}
