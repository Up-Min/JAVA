package test_11_24th_String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";
		
//		byte [] arr1 = data.getBytes("UTF-8"); //incoding as UTF-8
		byte [] arr1 = data.getBytes();
		System.out.println(Arrays.toString(arr1));
	
		String str1 = new String(arr1, "UTF-8"); //decoding as "utf-8"
		System.out.println(str1);
	}

}
