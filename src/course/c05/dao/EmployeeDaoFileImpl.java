package course.c05.dao;

public class EmployeeDaoFileImpl implements EmployeeDao {

	@Override
	public void add(Employee e) {
		System.out.println("Adding to files...");
	}

	@Override
	public void update(Employee e) {
		System.out.println("Updating to files...");
	}

	@Override
	public void delete(int id) {
		System.out.println("Deleting from files...");
	}

	@Override
	public Employee findById(int id) {
		return null;
	}

	@Override
	public Employee[] getAllEmployees() {
		return null;
	}

}
