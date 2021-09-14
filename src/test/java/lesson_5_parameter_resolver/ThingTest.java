package lesson_5_parameter_resolver;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ThingParameterResolver.class)
public class ThingTest {

	@Test
	void testAnswer(Thing thing) {
		assertEquals(42, thing.answer());
	}
}