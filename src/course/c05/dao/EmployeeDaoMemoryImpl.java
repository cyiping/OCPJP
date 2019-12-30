package course.c05.dao;

public class EmployeeDaoMemoryImpl implements EmployeeDao {
	@Override
	public void add(Employee e) {
		System.out.println("Adding to memory...");
	}

	@Override
	public void update(Employee e) {
		System.out.println("Updating to memory...");
	}

	@Override
	public void delete(int id) {
		System.out.println("Deleting from memory...");
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
