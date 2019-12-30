package course.c06;

public class UseAny<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return this.t;
	}

	public static void main(String[] args) {
		UseAny<String> x = new UseAny<>();

	}

}
