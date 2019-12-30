package course.c14.methodRefer;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo4 {

	String x;
	MethodReferenceDemo4() {
	}
	MethodReferenceDemo4(String x) {
		this.x = x;
	}
	void printX() {
		System.out.println(x);
	}

	private static void createObjectWithInput() {
		//Function<String, MethodReferenceDemo4> factory = (s) -> new MethodReferenceDemo4(s);
		Function<String, MethodReferenceDemo4> factory = MethodReferenceDemo4::new;
		MethodReferenceDemo4 demo4 = factory.apply("use constructor to input");
		demo4.printX();
	}

	private static void createObjectWithoutInput() {
		//Supplier<MethodReferenceDemo4> supplier = () -> new MethodReferenceDemo4();
		Supplier<MethodReferenceDemo4> supplier = MethodReferenceDemo4::new;
		MethodReferenceDemo4 demo4 = supplier.get();
	}

	public static void main(String[] args) {
		createObjectWithInput();
		createObjectWithoutInput();
	}

}
