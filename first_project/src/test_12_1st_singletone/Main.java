package test_12_1st_singletone;

public class Main {
	// if want to use ONLY ONE object print?

	public static void main(String[] args) {
		
		// create array to save user object
		User[] user = new User[10]; 

		// create user object and save in array
		for (int i=0; i<user.length; i++) {
			user[i] = new User("user" + i); //user 0, user1, ....
			user[i].print();
		}
		// 10user can use same THE ONLY ONE object.
	}
	
	/* new User -> create new 1 object -> (Main) user[i].print -> (User) getprinter 
	 * -> (null) -> (Printer) create new Printer -> printer.toString()
	 *  
	 *  *2nd user
	 *  new User -> create new 1 object -> (Main) user[i].print -> (User) getprinter 
	 * -> printer has value -> printer.toString()
	 * 
	 */

}
