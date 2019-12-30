package course.c04.enums;

enum PowerState {
	OFF, ON, SUSPEND;
}

class Machine2 {
	private PowerState state;

	public void setState(PowerState state) {
		this.state = state;
	}

	public PowerState getState() {
		return state;
	}
}

public class MachineTest2 {
	public static void main(String[] args) {
		Machine2 c = new Machine2();
		c.setState(PowerState.ON);
		c.setState(PowerState.SUSPEND);
		c.setState(PowerState.OFF);
		System.out.println(c.getState());
		System.out.println(c.getState().ordinal());
		//c.setState(30);//compile error
	}
}
