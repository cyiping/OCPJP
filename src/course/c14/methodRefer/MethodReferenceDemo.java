package course.c14.methodRefer;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

class StringUtil {
	static int compareIgnoreCase(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
	int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}

@SuppressWarnings("unused")
public class MethodReferenceDemo {
	
	String x;
	String[] arr;
	
	MethodReferenceDemo() {}
	
	MethodReferenceDemo(String x) {
		this.x = x;
		arr = x.split(",");
	}

	//「方法提供者」是「類別的靜態方法」，只是工具，不涉及物件狀態。
	private void demo1(String[] arr) {
		Arrays.sort(arr, (a, b) -> StringUtil.compareIgnoreCase(a, b));
		Arrays.sort(arr, StringUtil::compareIgnoreCase);
	}

	//「方法提供者」是「物件參照變數」，且不是Lambda表示式的方法參數
	private void demo2(String[] arr) {
		StringUtil util = new StringUtil();
		Arrays.sort(arr, (a, b) -> util.compare(a, b));
		Arrays.sort(arr, util::compare);
	}
	
	//「方法提供者」是「物件參照變數」，且來自Lambda表示式的方法參數
	private void demo3(String[] arr) {
		Arrays.sort(arr, (a, b) -> a.compareToIgnoreCase(b));
		Arrays.sort(arr, String::compareToIgnoreCase);
	}
	
	//參照建構子，只是靜態方法的變形
	private static void demo4() {
		String[] arr = { "a", "b", "c", "d", "e" };		
		Function<String, MethodReferenceDemo> factory1 = (s) -> new MethodReferenceDemo(s);
		Function<String, MethodReferenceDemo> factory2 = MethodReferenceDemo::new;
		MethodReferenceDemo demo = factory2.apply("a,b,c,d,e,f");
		demo.demo1(arr);
		demo.demo2(arr);
		demo.demo3(arr);
	}
	
	private static void demo41() {
		Supplier<MethodReferenceDemo> supplier1 = () -> new MethodReferenceDemo();
		Supplier<MethodReferenceDemo> supplier2 = MethodReferenceDemo::new;
		
		String[] arr = { "a", "b", "c", "d", "e" };
		supplier2.get().demo1(arr);
		supplier2.get().demo2(arr);
		supplier2.get().demo3(arr);
	}
	
	public static void main(String[] args) {
		demo4();
		demo41();
	}

}
