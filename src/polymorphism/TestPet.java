package polymorphism;

public class TestPet {

	public static void main(String[] args) {
		
		Pet myPet[] = new Pet[3];
		
		myPet[0] = new Cat();
		myPet[1] = new Cat();
		myPet[2] = new Dog();
		
		for(int i = 0; i < myPet.length; i++) {
			if(myPet[i] instanceof Cat) {
				System.out.println("Cat");
			}else if(myPet[i] instanceof Dog) {
				System.out.println("Dog");
			}
		}
	}

}
