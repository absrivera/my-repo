package inheritance;

public class TestPet {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		Dog myDog = new Dog();
		
		System.out.println(myCat.speak());
		
		System.out.println(myDog.speak());
		System.out.println(myDog.fetch());
	}

}
