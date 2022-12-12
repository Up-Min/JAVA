package school;

public class CheckPoint {
	public static String Majorkorea_m(int a) { //a is math, b is korean.
		return normalsubject(a); 
	}
	public static String Majorkorea_k(int a) { 
		return essentialsubject(a);		
	}
	public static String Majorcomputer_m(int a) { //a is math, b is korean.
		return essentialsubject(a); 
	}
	public static String Majorcomputer_k(int a) { 
		return normalsubject(a);		
	}
	public static String normalsubject(int c) {
		if(c<=100 && c>=90) {
			return "A";
		}else if (c<=89 && c>=80) {
			return "B";
		}else if (c<=79 && c>=70) {
			return "C";
		}else if (c<=69 && c>=55) {
			return "D";
		}
		return "F";	
	}

	public static String essentialsubject(int d) {
		if(d<=100 && d>=95) {
			return "S";
		}else if (d<=94 && d>=90) {
			return "A";
		}else if (d<=89 && d>=80) {
			return "B";
		}else if (d<=79 && d>=70) {
			return "C";
		}else if (d<=69 && d>=60) {
			return "D";
		}
		return "F";	
	}	
}
