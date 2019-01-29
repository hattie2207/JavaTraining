package levelTwo;
import java.util.ArrayList;

public class Person {

	private String name = "";
	private int age = 0;
	private String jobTitle = "";

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle; 			
	}		

	public String toString() {
		return "Name: " + name + " Age: " + age + " Job Title: " + jobTitle;

	}
	
	public String getName() {
		return name; 
	}
	
	public static Person searchByName(String name, ArrayList<Person> personList) {
		
		for (Person i : personList) {
			if (i.getName().equals(name)) {
				return i; 
			}
		}
		
		return null; 
	}

	public static void main(String[] args) {

		Person personOne = new Person("Hattie", 22, "Trainee");
		Person personTwo = new Person("Tom", 23, "Consultant");
		Person personThree = new Person("Patrick", 24, "Developer");		

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(personOne);
		personList.add(personTwo);
		personList.add(personThree);
		
		for (Person i : personList) {
			System.out.println(i);
		}			
		
		String personName = "Hattie";	
		System.out.println("\nSearch for: " + personName);			
		Person searchPerson = searchByName(personName, personList);
		System.out.println(searchPerson);

	}
}
