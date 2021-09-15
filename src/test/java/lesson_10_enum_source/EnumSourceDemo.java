package lesson_10_enum_source;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnumSourceDemo {

	@DisplayName("Passing enum values to the test method")
	@ParameterizedTest(name = "{index} => pet = ''{0}''")
//	@EnumSource(Pet.class)
	@EnumSource(value = Pet.class, names = {"CAT", "DOG"})
	void testEnumValuesForNonNullity(Pet pet) {
		assertNotNull(pet);
	}
}
