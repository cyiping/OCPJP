package course.c03;

class Source2 {
	private int result = 20;

	protected int getResult() {
		return result;
	}
}

class Test2 extends Source2 {
	public int reportSum() {
		return 10 + getResult();
	}

}

public class FieldShadowDemo2 {

	public static void main(String args[]) {
		System.out.println(new Test2().reportSum());
	}

}
