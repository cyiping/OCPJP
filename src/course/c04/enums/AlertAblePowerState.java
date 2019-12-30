package course.c04.enums;

interface AlertAble {
	void alert();
}

public enum AlertAblePowerState implements AlertAble {

	OFF("The power is off") {
		@Override
		public void alert() {
			System.out.println("OFF alert");	
		}
	}, 
	ON("The power is high"), 
	SUSPEND("The power is low");

	@Override
	public void alert() {
		System.out.println("default alert");	
	}
	
	private String description;

	private AlertAblePowerState(String d) {
		description = d;
	}

	public String getDescription() {
		return description;
	}
	
	public void changeDesc(String d) {
		description = d;
	}
}
