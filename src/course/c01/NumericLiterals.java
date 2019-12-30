package course.c01;

public class NumericLiterals {


	public static void main(String[] args) {
		//float pi1 = 3_.1415F;      // NG
		//float pi2 = 3._1415F;      // NG
		//long l = 999_99_9999_L;        // NG

		//int x1 = _52;              // NG
		int x2 = 5_2;              // OK (decimal literal)
		//int x3 = 52_;              // NG
		//int x4 = 5_______2;        // OK (decimal literal)

		//int x5 = 0_x52;            // NG
		//int x6 = 0x_52;            // NG
		int x7 = 0x5_2;            // OK (hexadecimal literal)
		//int x8 = 0x52_;            // NG

		int x9 = 0_52;             // OK (octal literal)
		int x10 = 05_2;            // OK (octal literal)
		//int x11 = 052_;            // NG

	}
}
