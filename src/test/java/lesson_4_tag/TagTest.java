package lesson_4_tag;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TagTest {

	@Test
	@DisplayName("CaseA: prod & dev")
	@Tag("production")
	@Tag("development")
	void testCaseA(TestInfo testInfo) {}

	@Test
	@DisplayName("CaseB: dev")
	@Tag("development")
	void testCaseB(TestInfo testInfo) {}

	@Test
	@DisplayName("CaseC: prod")
	@Tag("production")
	void testCaseC(TestInfo testInfo) {}
}
