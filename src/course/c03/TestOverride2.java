package course.c03;

class Super2 {
	protected static int num = 20;

	public static int reportSum() {
		return num;
	}
}

class Sub2 extends Super2 {
	protected static int num = 30;

	public static int reportSum() {
		return 10 + num;
	}
}

public class TestOverride2 {

	public static void main(String args[]) {
		Super2 s = new Sub2();
		System.out.println(s.reportSum());
		System.out.println(s.num);

		System.out.println(Super2.reportSum());
		System.out.println(Super2.num);
	}

}
