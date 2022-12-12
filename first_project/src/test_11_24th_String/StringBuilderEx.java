package test_11_24th_String;

public class StringBuilderEx {

	public static void main(String[] args) {
		// can use chainning - can attatch behind
		String data = new StringBuilder()
				.append("DEF") // add end of String Array
				.insert(0,"abc") // put String Array into selected location (index, String)
				.delete(3,4) //delete String Array (start index, end index) - 'd' delete
				.toString(); // completed String Array to String type
		System.out.println(data);
	}

}
