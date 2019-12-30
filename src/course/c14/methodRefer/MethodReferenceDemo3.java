package course.c14.methodRefer;

import java.util.Arrays;

public class MethodReferenceDemo3 {
	public static void main(String[] args) {
		String[] arr = { "a", "b", "c", "d", "e" };
		Arrays.sort(arr, (a, b) -> a.compareToIgnoreCase(b));
		Arrays.sort(arr, String::compareToIgnoreCase);
	}
}
