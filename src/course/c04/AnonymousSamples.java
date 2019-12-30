package course.c04;

class MySuper {
	void stuff() {
	}
}

interface MyInterface {
	void stuff();
}

class MySub extends MySuper {
	@Override
	void stuff() {
		System.out.println("This is MySub");
	}
}

class MyImpl implements MyInterface {
	@Override
	public void stuff() {
		System.out.println("This is MyImpl");
	}
}

public class AnonymousSamples {

	MySuper c1 = new MySub();

	MySuper c2 = new MySuper() {
		@Override
		void stuff() {
			System.out.println("This is Anonymous Sub class");
		}
	};

	MyInterface i1 = new MyImpl();

	MyInterface i2 = new MyInterface() {
		@Override
		public void stuff() {
			System.out.println("This is Anonymous Impl class");
		}
	};

	public static void main(String args[]) {
		AnonymousSamples c = new AnonymousSamples();
		c.c1.stuff();
		c.c2.stuff();
		c.i1.stuff();
		c.i2.stuff();
	}

}
