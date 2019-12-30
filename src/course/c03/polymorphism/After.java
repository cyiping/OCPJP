package course.c03.polymorphism;

abstract class Employee2 {
	abstract protected int calculateStock();
}

class Manager2 extends Employee2 {
	protected int calculateStock() {
		return 30;
	}
}

class Director2 extends Manager2 {
	protected int calculateStock() {
		return 40;
	}
}

class EmployeeStockPlan2 {
	public int grantStock(Employee2 e) {
		return e.calculateStock();
	}
}

public class After {
	public static void main(String[] args) {
		EmployeeStockPlan2 plan = new EmployeeStockPlan2();
		Manager2 m = new Manager2();
		System.out.println(plan.grantStock(m));
	}
}
