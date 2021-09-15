package lesson_7_repetition_info;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestReporter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepetitionInfoDemo {

	@RepeatedTest(3)
	void testWithRepetitionInfo(RepetitionInfo repetitionInfo, TestReporter testReporter) {
		testReporter.publishEntry("Repetition # " + repetitionInfo.getCurrentRepetition());
		assertEquals(3, repetitionInfo.getTotalRepetitions());
	}
}