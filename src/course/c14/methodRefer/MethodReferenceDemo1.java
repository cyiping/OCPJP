package course.c14.methodRefer;

import java.util.Arrays;

class Utility1 {
	static int compareIgnoreCase(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
}
public class MethodReferenceDemo1 {
	public static void main(String[] args) {
		String[] arr = { "a", "b", "c", "d", "e" };
		Arrays.sort(arr, (a, b) -> Utility1.compareIgnoreCase(a, b));
		Arrays.sort(arr, Utility1::compareIgnoreCase);
	}
}
