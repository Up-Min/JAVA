package test_12_2nd_multithread;

public class ThreadNameEx {
	// make 5 thread + give thread names
	public static void main(String[] args) {
		// how to get main thread's name?
		Thread mainThread = Thread.currentThread(); 
		// get current running thread's info (main thread)
		System.out.println(mainThread.getName());
		
		
		// create 3 thread.
		for(int i = 0; i<3; i++) {
			Thread th1 = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + "실행"); //get thread's name
				}	
			};

			th1.start();
			// Thread-1, Thread-2, Thread-3 - Thread's default value 
		}
		
		// give thread's name (thread 'chat')
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행"); //get thread's name
			}	
		};
		chatThread.setName("chat-thread"); // before starts thread, change thread's name
		chatThread.start();
	}

}
