package course.c03.polymorphism;

class Employee1 {}

class Manager1 extends Employee1 {}

class Director1 extends Manager1 {}

class EmployeeStockPlan1 {
	public int grantStock(Manager1 m) {
		return 30;
	}
	public int grantStock(Director1 a) {
		return 40;
	}
	// ... one method per employee type
}

public class Before {
	public static void main(String[] args) {
		EmployeeStockPlan1 plan = new EmployeeStockPlan1();
		Manager1 m = new Manager1();
		System.out.println(plan.grantStock(m));
	}
}
