package constructors;
//import java.util.Scanner;

public class TestConstructors {

	public static void main(String[] args) {
/*		String name;
		Scanner input = new Scanner(System.in);
		name = input.next();
*/		
		Person person = new Person();
		Person person1 = new Person("Smith");
		
		System.out.println("Name: " + person.getName());
		System.out.println("Name: " + person1.getName());

	}

}
