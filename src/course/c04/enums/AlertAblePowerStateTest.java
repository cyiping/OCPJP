package course.c04.enums;

import static java.lang.System.out;

public class AlertAblePowerStateTest {
	public static void main(String[] args) {
		//  測試列舉項目順序
		out.println(AlertAblePowerState.OFF.ordinal());
		out.println(AlertAblePowerState.ON.ordinal());
		out.println(AlertAblePowerState.SUSPEND.ordinal());
	
		// 測試列舉項目方法
		out.println(AlertAblePowerState.OFF.getDescription());
		out.println(AlertAblePowerState.ON.getDescription());
		out.println(AlertAblePowerState.SUSPEND.getDescription());

		// 修改列舉項目內容
		AlertAblePowerState.OFF.changeDesc("the power is shutdown");
		out.println(AlertAblePowerState.OFF.getDescription());

		// 測試實做介面的方法
		AlertAblePowerState.OFF.alert();
		AlertAblePowerState.ON.alert();
		AlertAblePowerState.SUSPEND.alert();
	}
}
