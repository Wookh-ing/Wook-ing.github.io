import person.PersonValidator;

public class TestValidator {
	public static void main(String[] args) {
		PersonValidator v = new PersonValidator();
		v.isValidName("테스트");
//		v.isValidName("테스트1");
//		v.isValidName("테스트!@#$");
//		v.isValidName("");
//		v.isValidName(null);
//		v.isValidName("asdfasdfqwer");
		
		
	}
}
