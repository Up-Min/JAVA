package test_12_5th_lamda;

public class Lamda_ex2 {

	public static void main(String[] args) {
//		Person person = new Person();
//		person.action((x,y) -> {
//			double result = x+y;
//			return result;
//		});
//		//run (c.person) action -> run person.action
//	
//		// if, one return setence. {}, return can disable.
//		person.action((x,y) -> x+y);

		
		Person p = new Person();
		p.action((x,y)->x+y);
		
		
	}
}