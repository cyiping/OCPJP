package course.c02;

class Vehicle {
	int x;

	Vehicle() {
		super();
	}

	Vehicle(int x) {
		this.x = x;
	}
}

class Car extends Vehicle {
	int y;

	Car() {
		super();
		//this(20); // compile error
	}

	Car(int y) {
		this.y = y;
	}
}

public class TestConstructors2 {
}
