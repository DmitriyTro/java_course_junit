package lesson_3_code_coverage;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.*;

class BranchCoverageTest {

	@ParameterizedTest
	@CsvSource({"1,2,3", "1,1,1", "2,1,0"})
	void testSumAllNumbers(String start, String end, String sum) {
		int expected = parseInt(sum);
		int actual = BranchCoverage.sumAllNumbers(parseInt(start), Integer.parseInt(end));
		assertEquals(expected, actual);
	}
}