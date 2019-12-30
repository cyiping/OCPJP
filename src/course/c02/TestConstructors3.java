package course.c02;

class SuperClass {	
	SuperClass() {}
}
class ChildClass {
	ChildClass(int x) {
		this();		//又踩一次階梯到父類別	
	}	
	ChildClass() {
		System.out.println("no-args");
	}
}

public class TestConstructors3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
