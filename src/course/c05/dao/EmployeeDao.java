package course.c05.dao;

public interface EmployeeDao {

	public void add(Employee e);

	public void update(Employee e);

	public void delete(int id);

	public Employee findById(int id);

	public Employee[] getAllEmployees();

}
