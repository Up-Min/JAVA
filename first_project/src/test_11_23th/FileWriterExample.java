package test_11_23th;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("file.txt")) {
		 fw.write("JAVA");
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
