package course.c05.dao;

public class EmployeeDaoFactory {
	public static EmployeeDao createEmployeeDao() {
		return new EmployeeDaoMemoryImpl();
		// return new EmployeeDaoFileImpl();
	}
}
