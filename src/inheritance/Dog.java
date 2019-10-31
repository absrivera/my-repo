package inheritance;

public class Dog extends Pet{
	
	public Dog() {
		setName("Unknown Dog");
	}
	
	public String fetch() {
		return "Yes I will fetch";
	}
}
