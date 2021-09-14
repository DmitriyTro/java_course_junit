package lesson_3_code_coverage;

public class BranchCoverage {

	public static int sumAllNumbers(int start, int end) {
		int result = 0;

		if (start > end) {
			result = 0;
		} else if (start == end) {
			result = start;
		} else {
			int pos = start;
			while (pos <= end) {
				result += pos++;
			}
		}
		return result;
	}
}