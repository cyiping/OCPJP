package course.c03;

class Source1 {
	protected int result = 20;
}

class Test1 extends Source1 {

	protected int result = 30; // Field Shadowing

	public int reportSum() {
		return 10 + result;
	}

}

public class FieldShadowDemo1 {
	public static void main(String args[]) {
		System.out.println(new Test1().reportSum());
	}
}