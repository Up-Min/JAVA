package test_11_24th_math;

public class MathEx {

	public static void main(String[] args) {
		double v1 = Math.ceil(5.3);  //roundUP
		double v2 = Math.floor(5.3); //round
		System.out.print(v1 + " , ");
		System.out.println(v2);
		
		long v3 = Math.min(3, 7);
		long v4 = Math.max(3, 7);
		System.out.print(v3 + " , ");
		System.out.println(v4);
		
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(value); //round
		System.out.print(value + " , ");
		System.out.print(temp1 + " , ");
		System.out.println(temp2);
		double v5 = temp2 / 100.0; //get decimal upper 2 point 
		System.out.println(v5);
	}

}
