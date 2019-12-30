package course.c03;

class Super1 {
	protected int num = 20;

	public int reportSum() {
		return num;
	}
}

class Sub1 extends Super1 {
	protected int num = 30;

	public int reportSum() {
		return 10 + num;
	}
}

public class TestOverride1 {

	public static void main(String args[]) {
		Super1 s = new Sub1();

		System.out.println(s.reportSum());

		System.out.println(s.num);

	}

}
