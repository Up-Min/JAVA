package test_11_24th_system;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {

	public static void main(String[] args) {

		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		Properties p1 = System.getProperties();
		Set keys = p1.keySet();
		
		for(Object objkey : keys) {
			String key = (String) objkey;
			System.out.println(key); //print usable keyname.
		}
	}

}
