package course.c01;

public class Test {
	public static void main(String args[]) {
		String test = "Blue";
		String color = null;
		switch (test) {
		case "Blue": // 若 "Blue" 和 test變數字串內容相同
			color = "Blue";
			break;
		case "Red": // 若 "Red" 和 test變數字串內容相同
			color = "Red";
			break;
		default: // 若都不相同
			color = "White";
		}
		System.out.println("Color: " + color);
	}

}
