package constructors;

public class App {

	public static void main(String[] args) {
		CopyConstructor c1 = new CopyConstructor(10,15);
		CopyConstructor c2 = new CopyConstructor(c1);
		CopyConstructor c3 = c2;			//if using copy constructors this is legal without the need for " = new copyConstructor()"
		
		
		if(c1.equals(c2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
		
		if(c1 == c2) {
			System.out.println("c1 == c2");
		}else {
			System.out.println("c1 != c2");
		}

		System.out.println(c2);
		System.out.println(c3 == c2);
	}

}
