package constructors;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Rectangle rec1 = new Rectangle(4);
		Rectangle rec2 = new Rectangle(4,5);
		
		System.out.println(rec.area());
		System.out.println(rec1.area());
		System.out.println(rec2.area());

	}

}
