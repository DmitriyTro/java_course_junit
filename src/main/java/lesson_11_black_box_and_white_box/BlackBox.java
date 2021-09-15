package lesson_11_black_box_and_white_box;

public class BlackBox {

	static void printNumBytes(int bytes) {
		if (bytes < 1024) {
			System.out.printf("%d\n", bytes);
		} else {
			System.out.printf("%5.2fkB\n", (double)bytes/1024);
		}
	}
}