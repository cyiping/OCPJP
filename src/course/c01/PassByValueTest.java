package course.c01;

public class PassByValueTest {

	public static void main(String[] args) {
		testPrimitive();
		testReference();
	}
	
	private static void testPrimitive() {
		int x = 10;
		int y = x;
		x = 5;
		System.out.println(y);	
	}
	
	private static void testReference() {
		Employee x = new Employee(1, "Jim");
		
		Employee y = x;
		x.setEmpId(2);
		System.out.println(y);	
		
		modifyEmployee(x);
		System.out.println(x);
	}
	
	private static void modifyEmployee(Employee e) {
		e = new Employee(3, "Bill");
		e.setEmpId(4);
	}

}
