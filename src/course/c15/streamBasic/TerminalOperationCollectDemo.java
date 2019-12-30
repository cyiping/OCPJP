package course.c15.streamBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationCollectDemo {
	
	public static List<Person> getPersonList() {
		List<Person> persons = Arrays
		.asList(new Person("Max", 18), 
				new Person("Peter", 23),
				new Person("Pamela", 23), 
				new Person("David", 12));
		return persons;
	}
	
	public static void main(String args[]) {
		testCollect();
		testAveragingDouble();
		testJoining();
		testGroupingBy();
		testPartitioningBy();
	}
	
	public static void testCollect() {
		String[] sArr = new String[] {"jim1", "jim2", "jim1", "jim2"};
		
		Stream<String> s1 = Stream.of(sArr);
		Set<String> set = s1.collect(Collectors.toSet());	
		set.stream().forEach(i -> System.out.print(i + ", "));	
		System.out.print("\n------------------\n");
		Stream<String> s2 = Stream.of(sArr);
		List<String> list = s2.collect(Collectors.toList());
		list.stream().forEach(i -> System.out.print(i + ", "));
	}



	public static void testAveragingDouble() {
		Double averageAge = 
				getPersonList().stream()
				.collect(Collectors.averagingDouble(p -> p.age));
		System.out.println(averageAge);	// 19.0
	}


	public static void testJoining() {
		List<String> sl = Arrays.asList("a", "b", "c", "d");
		
		String s1Join = sl.stream().collect(Collectors.joining());
		System.out.println(s1Join);	
		
		String s2Join = sl.stream().collect(Collectors.joining("-"));
		System.out.println(s2Join);	
		
		String s3Join = sl.stream().collect(Collectors.joining("-", "/*", "*/"));
		System.out.println(s3Join);	
	}
	


	public static void testGroupingBy() {
		/*
		Function<Person, Integer> classifier = 
			new Function<Person, Integer>() {
					public Integer apply(Person t) {
						return t.age;
					}
		};	*/
		Function<Person, Integer> classifier = p -> p.age;
		Map<Integer, List<Person>> personsByAge = 
				getPersonList().stream()
				.collect(Collectors.groupingBy(classifier));
		// Key:age, Value:personList
		personsByAge.forEach(
				(age, personList) -> 
					System.out.format("age %s: %s\n", age, personList)
		);
	}

	public static void testPartitioningBy() {
		Map<Boolean, List<Person>> personsByAge = 
				getPersonList().stream()
				.collect(Collectors.partitioningBy(s -> s.age > 20));
		System.out.println("Is age > 20 ?");
		personsByAge.forEach(
			(k, v) -> System.out.println(
							k + ":\t"
							+ v.stream()
								.map(s -> s.name)
								.collect( Collectors.joining(",") )
					)
		);
	}
	
	
}
