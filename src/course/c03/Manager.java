package course.c03;

public class Manager extends Employee {

	private String deptName;
	
	public Manager(int empId, String name, String ssn, double salary, String deptName) {
		super(empId, name, ssn, salary);
		this.deptName = deptName;
	}

	@Override
	public String profile() {
		return super.profile() + " ,Department:" + this.deptName;
	}
	
	public static void main(String args[]) {
		Employee e = new Employee (1, "Jim", "11111", 100_000.00);
		System.out.println (e.profile());

		Manager m = new Manager (2, "Tom", "22222", 200_000.00, "Marketing");
		System.out.println (m.profile());
		
		Employee em = new Manager (2, "Tom", "22222", 200_000.00, "Marketing");
		System.out.println (em.profile());


	}

}
