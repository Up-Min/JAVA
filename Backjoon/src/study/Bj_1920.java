package study;

import java.util.Arrays;
import java.util.Scanner;

public class Bj_1920 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		int [] A = new int [sc.nextInt()];
		for(int i =0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		int [] B = new int [sc.nextInt()];
		for(int i =0; i<B.length; i++) {
			B[i] = sc.nextInt();
		}
		int [] C = new int[B.length]; 
		
		for(int i =0; i<B.length; i++) {
			for(int j=0 ; j<A.length; j++) {
				if(B[i] == A[j]) {
					C[i] ++;
				}
			}
		}
		for(int i=0; i<C.length; i++) {
			System.out.println(C[i]);			
		}
		
		sc.close();
	}

}
