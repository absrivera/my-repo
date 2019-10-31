package constructors;

public class TestFraction {

	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(5);
		Fraction f3 = new Fraction(9,3);
		Fraction f4 = new Fraction(f3);
		
		System.out.println(f1.compute());
		System.out.println(f2.compute());
		System.out.println(f3.compute());
		System.out.println(f4.compute());
		
	}

}
