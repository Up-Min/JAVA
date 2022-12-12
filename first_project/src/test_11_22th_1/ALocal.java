package test_11_22th_1;

public class ALocal {
	void useB() {
		// can't change value, if int declares.
		// it difines as final int variable.
		
		// local variable declare (to use in function)
		int var = 1; // can't change value, if int declares.
					// it difines as final int variable.
		
		class B {
			// instance field declare 
			int field1 = 1;
			//constructor declare
			B(){
				System.out.println("B constructor operate");
			}
			//instance method declare
			void method1() {
				System.out.println("B method1 operate");				
			}	
			//instance method declare
			void method2() {
//				arg = 2;
				// if class overlaps, can't change variable.
			}	
		}
		/* make new object in method
		 * because local variable only available in method
		 */
		B b =  new B();

		//run field, method
		System.out.println(b.field1);
		b.method1();
	}
	
}
