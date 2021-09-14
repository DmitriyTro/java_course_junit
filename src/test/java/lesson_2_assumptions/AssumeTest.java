package lesson_2_assumptions;

import org.junit.Assume;
import org.junit.Test;

public class AssumeTest {

	@Test
	public void testIfVersionGreaterThen4() {
		String versionNumber = "5";
		Assume.assumeTrue(Integer.valueOf(versionNumber) >= 4);
	}
}