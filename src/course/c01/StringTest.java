package course.c01;

public class StringTest {

	public static void main(String args[]) {
		testEquality();
		testFun();
	}
	
	public static void testEquality() {

		String s1 = "jim";
		String s2 = "jim";
		String s3 = new String("jim");

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
		System.out.println(s1 + s2);
	}
	
	public static void testFun() {
		String s1 = "World";
		String s2 = "";
		s2 = "Hello".concat(s1);
		System.out.println("String2: " + s2);
		// 取得長度
		System.out.println("Length: " + s2.length());
		// 取得子字串
		System.out.println("Sub: " + s2.substring(0, 4));
		// 轉換為大寫
		System.out.println("Upper: " + s2.toLowerCase());

	}
}