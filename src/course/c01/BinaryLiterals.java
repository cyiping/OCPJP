package course.c01;

public class BinaryLiterals {

	public static void main(String[] args) {
		// 8-bit 'byte' value:
		byte b = 0b0001_0001;

		// 16-bit 'short' value:
		short s = (short) 0b1001_0001_0100_0101;

		// 32-bit 'int' values:
		int i1 = 0b1001_0001_0100_0101_1010_0001_0100_0101;

		int i2 = 0b101;
		int i3 = 0B101; // The B can be upper or lower case.

	}

}
