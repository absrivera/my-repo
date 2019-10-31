package constructors;

public class Person {
	private String name;
	
	public Person() {
		setName("Unknown");
	}
	
	public Person(String name) {
		setName(name);			//best practice is to use setters and getters for assignment and only using = for actual set method  
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
