package course.c02.polymorphism;

public abstract class TV {

	public void turnOn() {
		System.out.println("turnOn TV");
	}

	public void turnOff() {
		System.out.println("turnOff TV");
	}

	public void changeChannel() {
		System.out.println("TV changeChannel(), once a channel.");
	}

	public void changeVolume() {
		System.out.println("TV changeVolume()");
	}
}
