package course.c15;

import java.util.Optional;

public class OptionalDemo {

	public static void testNull() {
		char str[] = { 'D', 'u', 'k', 'e' };
		String s = null;
		for (char c : str) {
			s = s + c;
		}
		System.out.println(s);
		Object o = null;
		System.out.println(o);
		// System.out.println(null); //can't compiled!!
	}

	public static Double average0(int... scores) {
		if (scores.length == 0)
			return null;
		int sum = 0;
		for (int score : scores)
			sum += score;
		return (double) sum / scores.length;
	}

	public static Optional<Double> average1(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}

	public static <T> Optional<T> createOptional(T value) {
		
		//Optional<T> o = (value == null) ? Optional.empty() : Optional.of(value);
		Optional<T> o = Optional.ofNullable(value);
		return o;
	}

	
	public static <T> Optional<T> useOf2Create(T value) {
		return Optional.of(value);
	}
	public static <T> Optional<T> useofNullable2Create(T value) {
		return Optional.ofNullable(value);
	}
	public static void main(String[] args) {
		
		String s = null;
		
		System.out.println(useofNullable2Create(s));
		System.out.println(useOf2Create(s));
		
		//testNull();
		//testOptional();
	}

	public static void testOptional() {
		System.out.println("show01: " + average1(90, 100)); // Optional[95.0]
		System.out.println("show02: " + average1()); // Optional.empty

		Optional<Double> optOK = average1(90, 100);
		if (optOK.isPresent()) {
			System.out.println("show03: " + optOK.get()); // 95.0
		}
		Optional<Double> optNG = average1();
		//System.out.println("show04: " + optNG.get()); // May throw java.util.NoSuchElementException if no value in it

		Optional<Double> opt1 = average1(90, 100);
		opt1.ifPresent(d -> System.out.println("show05: " + d));
		
		// no value in it
		Optional<Double> opt2 = average1();	
		System.out.println("show06: " + opt2.orElse(Double.NaN));
		System.out.println("show07: " + opt2.orElseGet(() -> Math.random()));
		 System.out.println("show08: " + opt2.orElseThrow(() -> new IllegalStateException()));

		// there is value in it
		Optional<Double> opt3 = average1(90, 100);	
		System.out.println("show09: " + opt3.orElse(Double.NaN));
		System.out.println("show10: " + opt3.orElseGet(() -> Math.random()));
		System.out.println("show11: " + opt3.orElseThrow(() -> new IllegalStateException()));
	}

}
