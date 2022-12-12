package test_11_23th;

public class ExceptionEx4 {
	// if, want to handle 2 other exception at once in 1 block?
	public static void main(String[] args) {
		String[] array = { "100", "1oo", null, "200" }; // null, 1oo error

		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "] :" + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			} catch (NullPointerException | NumberFormatException e) {
				// to handle 2 other exception at once
				System.out.println("데이터에 문제가 있음 : " + e.getMessage());
			}
		}
	}
}
