package course.c14.methodRefer;

import java.util.Arrays;


class Utility2 {
	int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
public class MethodReferenceDemo2 {
	public static void main(String[] args) {
		String[] arr = { "a", "b", "c", "d", "e" };
		Utility2 util = new Utility2();
		Arrays.sort(arr, (a, b) -> util.compare(a, b));
		Arrays.sort(arr, util::compare);
	}
}
