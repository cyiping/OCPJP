package course.c02;


interface Skill_1 {
	void makeMoney();
}
interface Skill_2 {
	void makeMoney();
}
class Father {
	void makeMoney() {
		System.out.println("from Father");
	}
}
class Mother {
	public void makeMoney() {
		System.out.println("from Mother");
	}
}
class Child implements Skill_1, Skill_2 {
	@Override
	public void makeMoney() {
		System.out.println("make money by java and database");
	}
}
class Boy extends Father implements Skill_2 {
	@Override
	public void makeMoney() {
		super.makeMoney();
	}
}
class Girl extends Mother implements Skill_1 {
	// 父類別Mother的方法必須是public，可以以父類別的方法充抵介面方法的實做
}

public class ShowMultiInterfaces  {
	public static void main(String args[]) {
		new Child().makeMoney();
		new Boy().makeMoney();
		new Girl().makeMoney();
	}
}
