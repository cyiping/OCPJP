package course.c06.compare;

import java.util.Calendar;
import static java.lang.System.out;

public class TestOrder {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();
		Calendar tomorrow = Calendar.getInstance();
		tomorrow.add(Calendar.DATE, 1);
		out.println(today.compareTo(tomorrow));

		out.println("A".compareTo("B"));
		
		out.println(new Integer(5).compareTo(new Integer(6)));
		
	}

}
