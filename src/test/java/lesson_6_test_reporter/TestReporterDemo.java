package lesson_6_test_reporter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

public class TestReporterDemo {

	@Test
	void testKeyValuePair(TestReporter testReporter) {
		testReporter.publishEntry("my key", "my value");
	}

	@Test
	void testMultipleKeyValuePairs(TestReporter testReporter) {
		Map<String, String> values = new HashMap<>();
		values.put("name", "Kolya");
		values.put("handle", "Pikachu");
		testReporter.publishEntry(values);
	}
}