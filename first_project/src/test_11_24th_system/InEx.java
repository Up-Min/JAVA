package test_11_24th_system;

import java.io.IOException;

public class InEx {

	public static void main(String[] args) throws IOException {
		// if error occurs in, output -> jvm will handle it.
		int speed = 0;
		int keycode = 0;
		
		while(true) {
			// if not read key 'enter', activate
			if(keycode != 13 && keycode != 10) {
				// keycode 10, 13 means 'enter'		
				if(keycode == 49) { //if input number '1'
					speed++;
				}else if (keycode == 50) { //if input number '2'
					speed--;
				}else if (keycode == 51) { //if input number '2'
					break;
				}
				System.out.println("-------------------");
				System.out.println("1. 가속 2. 감속 3. 중지");
				System.out.println("-------------------");
				System.out.println("현재속도 = " + speed);
				System.out.println("선택 : ");
			}
			keycode = System.in.read(); // read each keyboard.
		}

	}

}
