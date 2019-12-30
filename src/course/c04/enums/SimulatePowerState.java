package course.c04.enums;

public class SimulatePowerState {

	public static final SimulatePowerState OFF 
		= new SimulatePowerState("The power is off");
	public static final SimulatePowerState ON 
		= new SimulatePowerState("The power is high");
	public static final SimulatePowerState SUSPEND 
		= new SimulatePowerState("The power is low");

	private String description;

	private SimulatePowerState(String d) {
		description = d;
	}

	public String getDescription() {
		return description;
	}

	public void setDecription(String d) {
		description = d;
	}

}
