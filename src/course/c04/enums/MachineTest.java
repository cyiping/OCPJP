package course.c04.enums;

class Machine {

	public static final int POWER_OFF = 0;
	public static final int POWER_ON = 1;
	public static final int POWER_SUSPEND = 2;

	private int state;

	public void setState(int state) {
		if (state == 0 || state == 1 || state == 2) {
			this.state = state;
		}
	}

	public int getState() {
		return state;
	}
}

public class MachineTest {
	public static void main(String[] args) {
		Machine c = new Machine();
		c.setState(Machine.POWER_ON);
		c.setState(Machine.POWER_SUSPEND);
		c.setState(Machine.POWER_OFF);
		System.out.println("before:" + c.getState());
		c.setState(30);
		System.out.println("after:" + c.getState());
	}
}
