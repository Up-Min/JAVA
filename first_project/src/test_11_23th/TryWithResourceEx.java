package test_11_23th;

public class TryWithResourceEx {

	public static void main(String[] args) {
		// in try, declare resource object want to open.
		try(MyResource res = new MyResource("A")){
	// !!! try(MyResource res = new MyResource("A")) means declare Resource !!!
			// shows error underline : because resource never closed.
			// Autocloseable : to use closing resource automatically.
			
			String data = res.read2(); 
			int value = Integer.parseInt(data); 
			System.out.println(value); // if, error detected? -1-
			
			// case res.read1();
			// constructor -> myResourceA -> res.read1() -> return100 int data
			// -> print 100 -> autoclose			
			
		}catch(Exception e) {
			//catch error on here -2-
			System.out.println(e.getMessage());
			
			// case res.read2();
			// error detected on (res.read2()) -> NumberformatException error appear
			// MyResource("A") -> read2 print -> return abc -> error appear on line 12
			// -> throws error ("MyResource A 닫기)" -> print e.getMessage			
		}
	}
}
