package course.c05;

class Super {}

interface Interface {}

public class Child extends Super implements Interface {
	
	public static void main(String args[]) {
		
		Interface i = new Child();
		
		System.out.println(i instanceof Object);
		System.out.println(i instanceof Interface);
		System.out.println(i instanceof Super);
		System.out.println(i instanceof Child);		
		
		Super s = new Child();
		
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Interface);
		System.out.println(s instanceof Super);
		System.out.println(s instanceof Child);
		
	}
}