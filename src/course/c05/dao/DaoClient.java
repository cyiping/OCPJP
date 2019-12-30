package course.c05.dao;

public class DaoClient {

	public void addEmployee(Employee e) {
		EmployeeDao dao = new EmployeeDaoMemoryImpl();
		dao.add(e);
	}

	public void updateEmployee(Employee e) {
		EmployeeDao dao = new EmployeeDaoMemoryImpl();
		dao.update(e);
	}

	public void deleteEmployee(Employee e) {
		EmployeeDao dao = EmployeeDaoFactory.createEmployeeDao();
		dao.delete(e.getId());
	}

}
