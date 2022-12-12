package study;

import java.util.Scanner;

public class Bj_1978 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] N = new int [sc.nextInt()];
		int result = 0;
		
		for (int i=0; i<N.length; i++) {
			N[i] = sc.nextInt();
		}
		
		for(int i =0; i<N.length; i++) {
			if(N[i] < 10) {
				if (N[i] == 2) {
					result ++;
					continue;
				}else if (N[i] == 3) {
					result ++;
					continue;
				}
				else if (N[i] == 5) {
					result ++;
					continue;
				}
				else if (N[i] == 7) {
					result ++;
					continue;
				}
			}else if(N[i]>=10) {
					if(N[i] % 2 == 0) {
						result += 0;
						continue;
					}else if(N[i] % 3 == 0){
						result += 0;
						continue;
					}
					else if(N[i] % 4 == 0){
						result += 0;
						continue;
					}
					else if(N[i] % 5 == 0){
						result += 0;
						continue;
					}
					else if(N[i] % 6 == 0){
						result += 0;
						continue;
					}
					else if(N[i] % 7 == 0){
						result += 0;
						continue;
					}
					else if(N[i] % 8 == 0){
						result += 0;
						continue;
					}
					else if(N[i] % 9 == 0){
						result += 0;
						continue;
					}
					if(N[i] % N[i] == 0 && N[i] % 1 == 0){
						result++;
						continue;
					}
			}
			
		}
		System.out.println(result);
	}

}
