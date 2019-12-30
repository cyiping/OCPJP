package course.c05;

interface Car {
	public void start();
}

class CommonCar implements Car {
	public void start() {
		System.out.println("starting...");
	}
}

class DivingPlugIn {
	public void dive() {
		System.out.println("diving...");
	}
}

class FlyingPlugIn {
	public void fly() {
		System.out.println("flying...");
	}
}

class CompositedSuperCar implements Car {
	
	private CommonCar car = new CommonCar();
	private DivingPlugIn divingPlugIn = new DivingPlugIn();
	private FlyingPlugIn flyingPlugIn = new FlyingPlugIn();
	
	public void start() {
		car.start();
	}
	public void fly() {
		flyingPlugIn.fly();
	}
	public void dive() {
		divingPlugIn.dive();
	}
}

class Driver {
	public void testCar(Car c) {
		if (c instanceof CommonCar) {
			((CommonCar)c).start();
		} else if (c instanceof CompositedSuperCar) {
			CompositedSuperCar superCar = (CompositedSuperCar)c;
			superCar.start();
			superCar.dive();
			superCar.fly();
		}
	}
}

public class CompositionDemo {
	public static void main(String args[]) {
		Car basicCar = new CommonCar();
		Driver p1 = new Driver();
		p1.testCar(basicCar);
		
		Car superCar = new CompositedSuperCar();
		Driver p2 = new Driver();
		p2.testCar(superCar);
	}
}
