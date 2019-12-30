package course.c03.casting;

class Employee {
}
class Manager extends Employee {
}
class Director extends Manager {
}
interface Quit {
}

public class CastTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		testCastClass(m);
		testCastInterface(m);
	}

	private static void testCastClass(Manager m) {
		// 向上轉型
		Employee e = (Employee) m;
		// 平行轉型
		Manager m2 = (Manager) m;
		// 向下轉型 (compiler認為可能是Director，因此有可能會是 平行轉型)
		Director d = (Director) m;
	}
	private static void testCastInterface(Manager m) {
		Quit q = (Quit) m;
	}
}
