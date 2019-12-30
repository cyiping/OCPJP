package course.c04;

import java.util.Date;

public class FinalFieldClass {

	private final int field;
	private final int forgottenField;
	private final Date now = new Date();
	public static final int SOME_CONSTANT = 10;

	public FinalFieldClass() {
		field = 100;
		forgottenField = 200;
	}

	public FinalFieldClass(Object o) {
		field = 300;
	}

	public void changeValues(final int param) {
		param = 1; // compile-time error
		now.setTime(0); // allowed
		now = new Date(); // compile-time error
		final int localVar;
		localVar = 42; // 宣告給值可以分開
		localVar = 43; // compile-time error
	}
	
	public static void main(String args[]) {
		FinalFieldClass v = new FinalFieldClass();
		FinalFieldClass v1 = new FinalFieldClass(new Object());
	}
	
}
