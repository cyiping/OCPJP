package course.c16;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		DateTimeFormatter formatter = null;
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(now.format(formatter));
		// 2016-01-12
		
		formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
		System.out.println(now.format(formatter));
		// 2016-012+08:00
		
		formatter = DateTimeFormatter
				.ofPattern("EEEE, MMMM dd, yyyy G, hh:mm a VV");
		System.out.println(now.format(formatter));
		// 星期二, 一月 12, 2016 西元, 09:48 上午 Asia/Taipei
		
		formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(now.format(formatter));
		// 2016/1/12 上午 09:48:06

	}

}
