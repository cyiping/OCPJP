package course.c03;

public class Employee {

	private int empId;
	private String name;
	private String ssn;
	private double salary;

	public Employee(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public String profile() {
		return "id:" + empId + " ,name:" + name;
	}

	public String toString() {
		return "Employee id: " + empId + "Employee name:" + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	
}
