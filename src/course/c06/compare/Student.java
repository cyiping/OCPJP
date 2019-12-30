package course.c06.compare;

public class Student implements Comparable<Student> {
	
	private String name;
	private long id;
	private double score;

	public Student(String name, long id, double score) {
		this.name = name;
		this.id = id;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public double getScore() {
		return this.score;
	}

	public String toString() {
		return this.name + "\t" + this.id + "\t" + this.score;
	}

	@Override
	public int compareTo(Student s) {
		// use method dedication
		int sortById = new Long(this.id).compareTo(new Long(s.id));
		int sortByName = this.name.compareTo(s.getName());
		int sortByScore = new Double(this.score).compareTo(new Double(s.score));

		return sortById;
	}
}