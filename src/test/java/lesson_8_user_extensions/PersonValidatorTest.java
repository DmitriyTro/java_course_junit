package lesson_8_user_extensions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testing PersonValidator")
public class PersonValidatorTest {

	@Nested
	@DisplayName("When using valid data")
	@ExtendWith(ValidPersonParameterResolver.class)
	public class ValidData {

		@RepeatedTest(10)
		@DisplayName("All first names are valid")
		public void testValidateFirstName(Person person) {
			assertTrue(PersonValidator.validatorFirstName(person));
		}
	}

	@Nested
	@DisplayName("When using invalid data")
	@ExtendWith(InvalidPersonParameterResolver.class)
	public class InvalidData {

		@RepeatedTest(10)
		@DisplayName("All first names are invalid")
		public void testValidateFirstName(Person person) {
			assertTrue(PersonValidator.validatorFirstName(person));
		}
	}
}