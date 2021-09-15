package lesson_8_user_extensions;

public class PersonValidator {

	public static boolean validatorFirstName(Person person) {
		String name = person.getFirstName();
		if (name.isEmpty()) {
			return false;
		}
		for (char ch : name.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}
}