package test_11_14th;

public class Member {

		String name;
		String id;
		String password;
		int age;
		
		Member(String name, String id) {
			this.name = name;
			this.id = id;
		}
		
		boolean login(String id, String password) {
			if (id.equals("hong")) {
				if(password.equals("12345")) {
					boolean result = true;
					return result;
				}
				return false;
			}
			return false;
		}
		
		void logout(String id) {
			System.out.println(id+"님이 로그아웃 되었습니다.");
		}
		
		
}
