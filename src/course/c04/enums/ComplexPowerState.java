package course.c04.enums;

public enum ComplexPowerState {

	OFF("The power is off"), 
	ON("The power is high"), 
	SUSPEND("The power is low");

	private String description;

	private ComplexPowerState(String d) {
		description = d;
	}

	public String getDescription() {
		return description;
	}

	public void setDecription(String d) {
		description = d;
	}

}
