package lesson_11_black_box_and_white_box;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BlackBoxTest {

	@ParameterizedTest
	@ValueSource(ints = {-10,10,0,1024})
	void testPrintNumBytes(int ints) {
		BlackBox.printNumBytes(ints);
	}
}
