package course.c15;

public class Person {
	private String name, email;
	private int age;

	private Person(Person.Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.email = builder.email;
	}
	
	public static class Builder {
		private String name = "", email = "";
		private int age = 0;
		public Person.Builder name(String name) {
			this.name = name;
			return this;
		}
		public Person.Builder age(int val) {
			this.age = val;
			return this;
		}
		public Person.Builder email(String val) {
			this.email = val;
			return this;
		}
		public Person build() {
			return new Person(this);
		}
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Name=" + name + ", Age=" + age + ", email=" + email + "\n";
	}
	public void printPerson() {
		System.out.println(this);
	}
}
