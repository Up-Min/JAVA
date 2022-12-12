package test_11_24th_math;

import java.util.Random;

public class RandomEx2 {
	// import random
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i=0; i<10; i++) {
			//nextInt(n) : makes (0<= ~ <n) range number.
//			System.out.print(rand.nextInt(10)+",");
		}
			System.out.println();
			
			Random rand2 = new Random(4234); // input seed in Random('  ')
			System.out.println(rand2);
			for (int i = 0; i<6; i++) {
				System.out.print(rand2.nextInt(10) + ",");
			}
			// result never change when input seed.
			// make random number use seed.
			
			
		
	}

}
