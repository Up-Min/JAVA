package test_11_23th;

public class Athis {
	// Athis class instance field declare.
	String field = "A-field";
	
	// Athis class instance method declare.
		
	void method() {
		System.out.println("A-method");
	}
	// make instance member class
	class B{
		// B's instance field declare. (name should same with data-type!)
		String field = "B-field";
		// B's instance method declare.
		void method() {
			System.out.println("B-method");
		}
		
		// B's instance method declare.
		void print() {
//			System.out.println(this.field);
//			this.method(); // this -> B : this.field means "B-field"
// ★ how to get  different class's field, method with same name???
		System.out.println(Athis.this.field);
		Athis.this.method();
		// ★ add class's name after declare.
		}	
	}	
	// Aclass's instance method
	void useB() {
		B b = new B();
		b.print();
	}
}
