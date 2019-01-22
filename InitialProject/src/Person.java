import java.util.ArrayList;

public class Person {

	String name = "";
	int age = 0;
	String jobTitle = "";

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle; 			
	}		

	public String toString() {
		return "Name: " + name + " Age: " + age + " Job Title: " + jobTitle;

	}

	public static void main(String[] args) {

		Person personOne = new Person("Hattie", 22, "Trainee");
		Person personTwo = new Person("Tom", 23, "Consultant");
		Person personThree = new Person("Patrick", 24, "Developer");		

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(personOne);
		personList.add(personTwo);
		personList.add(personThree);

	}

}
