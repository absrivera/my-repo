package inheritance;

public class Pet {
	private String name;
	
	public Pet() {
		setName("unknown");
	}
	
	public String speak() {
		return "I am your pet";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
