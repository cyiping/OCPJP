package course.c04.enums;

import static course.c04.enums.PowerState.*;

public class MachineTest3 {
	public static void main(String[] args) {
		Machine2 c = new Machine2();
		c.setState(ON);
		c.setState(SUSPEND);
		c.setState(OFF);
		System.out.println(SUSPEND);
		System.out.println(getDescription(SUSPEND));
	}

	static String getDescription(PowerState state) {
		switch (state) {
		case OFF:
			return "The power is off";
		case ON:
			return "The power is high";
		case SUSPEND:
			return "The power is low";
		default:
			return "unknown state";
		}
	}
}
