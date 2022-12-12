package test_11_28th_Format;

import java.text.DecimalFormat;

public class DecimalFormat_ex {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		
		// declare DecimalFormat
		DecimalFormat df = new DecimalFormat("#,###"); // # = integer, set format.
		System.out.println(df.format(num)); // adapt format. 

		DecimalFormat dt = new DecimalFormat("#,###.0"); // # = integer, set format.
		System.out.println(dt.format(num)); // adapt format. 

	}

}
