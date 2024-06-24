package user_management;

public class User {
	
		int id;
		String firstName;
		String lastName;
		String gender;
		int age;
		String email;
		String passward;
		String confirmPassward;

		public void printUser() {
			System.out.println("First Name : " + firstName);
			System.out.println("last Name : " + lastName);
			System.out.println("gender : " + gender);
			System.out.println("age : " + age);
			System.out.println("email : " + email);

		}

	}
