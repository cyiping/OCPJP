package course.c13;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatCurrency {

	public static void main(String[] args) {
		NumberFormat numberFormat;

		numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Locale.US: " + numberFormat.format(1000000));

		numberFormat = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		System.out.println("Locale.TAIWAN: " + numberFormat.format(new Double(1000000.00)));

		numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println("Locale.JAPAN: " + numberFormat.format(1000000.00));
	}
}
