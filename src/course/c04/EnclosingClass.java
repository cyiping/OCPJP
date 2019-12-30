package course.c04;

public class EnclosingClass {

	private int privateField = 99;

	// Anonymous classes
	public Object o = new Object() {
		@Override
		public String toString() {
			return "Anonymous class as field";
		}
	};

	// Member classes
	class MemberInner {
		public void run() {
			System.out.println("Member class: " + privateField);
		}
	}
	
	// Static nested classes
	static class StaticNestedClass {
		public void run() {
			System.out.println("StaticNested class");
		}
	}

	public void test1() {
		// Anonymous classes
		Object o = new Object() {
			@Override
			public String toString() {
				return "Anonymous class as local variable";
			}
		};
		System.out.println(o);
		System.out.println(this.o);
	}
	
	public void test2() {
		// Local classes
		class LocalInner {
			public void run(String s) {
				System.out.println(s);
			}
		}
		new LocalInner().run("Local classes: " + privateField);
	}
	
	
	
	public static void main(String[] args) {
		
		EnclosingClass outer = new EnclosingClass();
		outer.test1();
		outer.test2();
		
		MemberInner inner = outer.new MemberInner();
		inner.run();
		
		StaticNestedClass staticNested = new EnclosingClass.StaticNestedClass();
		staticNested.run();
	}

}
