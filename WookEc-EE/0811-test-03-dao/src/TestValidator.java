import person.PersonValidator;

public class TestValidator {
	public static void main(String[] args) {
		PersonValidator v = new PersonValidator();
		v.isValidName("�׽�Ʈ");
//		v.isValidName("�׽�Ʈ1");
//		v.isValidName("�׽�Ʈ!@#$");
//		v.isValidName("");
//		v.isValidName(null);
//		v.isValidName("asdfasdfqwer");
		
		
	}
}
