
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

	}

}
