package course.c14.advanceFI;

import java.util.List;
import java.util.function.ToDoubleFunction;

import course.c14.Person;

public class ToDoubleFunctionDemo {
	public static void main(String[] args) {

		List<Person> pl = Person.createList();
		Person first = pl.get(0);

		ToDoubleFunction<Person> convertAgeToDouble = p -> p.getAge();
		/* use anonymous inner class:	
		ToDoubleFunction<Person> convertAgeToDouble = 
				new ToDoubleFunction<Person>() {
					public double applyAsDouble(Person p) {
						return p.getAge();
					}
		};	
		*/
		System.out.println(convertAgeToDouble.applyAsDouble(first));
	}
}
