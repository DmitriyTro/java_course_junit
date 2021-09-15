package lesson_8_user_extensions;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.util.Random;

public class ValidPersonParameterResolver implements ParameterResolver {

	public static final Person[] VALID_PERSONS = {
			new Person().setId(1L).setFirstName("Masha").setLastName("Ivanova"),
			new Person().setId(1L).setFirstName("Petr").setLastName("Sidorov"),
			new Person().setId(1L).setFirstName("Dasha").setLastName("Petrova"),
			new Person().setId(1L).setFirstName("Sasha").setLastName("Kuznetsov"),
			new Person().setId(1L).setFirstName("Pasha").setLastName("Korolyov"),
			new Person().setId(1L).setFirstName("Natasha").setLastName("Rostova"),
	};

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
		boolean ret = false;
		if (parameterContext.getParameter().getType() == Person.class) {
			ret = true;
		}
		return ret;
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
		Object ret = null;
		if (parameterContext.getParameter().getType() == Person.class) {
			ret = VALID_PERSONS[new Random().nextInt(VALID_PERSONS.length)];
		}
		return ret;
	}
}