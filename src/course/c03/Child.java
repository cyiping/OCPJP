package course.c03;

interface TTT {
	int jimmm = 8;
}

class Father {
	private void test() {
		System.out.println("Ha..");
	}
	
	public static void main(String[] args) {
		Father f = new Child();
		f.test();
	}

}

public class Child extends Father {
	public static void main(String[] args) {
		Father f = new Child();
		f.test();
	}
}


