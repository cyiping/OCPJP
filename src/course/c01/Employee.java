package course.c01;

public class Employee {
	public final int COMPANY_ID = 1234567890;
	public int empId;
	public String name;
	public String ssn;
	public double salary;

	public Employee() {}

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return this.empId + "-" + this.name;
	}
}