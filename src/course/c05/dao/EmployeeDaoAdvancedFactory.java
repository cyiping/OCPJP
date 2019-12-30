package course.c05.dao;

public class EmployeeDaoAdvancedFactory {
	public static EmployeeDao createEmployeeDao() {
		String name = "course.c05.dao.EmployeeDaoFileImpl";
		try {
			Class clazz = Class.forName(name);
			EmployeeDao dao = (EmployeeDao) clazz.newInstance();
			return dao;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String args[]) {
		EmployeeDao dao = EmployeeDaoAdvancedFactory.createEmployeeDao();
		System.out.println(dao);
	}
}
