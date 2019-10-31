package constructors;

public class TestClock {

	public static void main(String[] args) {
		Clock time1 = new Clock();
		Clock time2 = new Clock(2);
		Clock time3 = new Clock(5,30);
		Clock time4 = new Clock(3,22,3);
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		System.out.println(time4);
	}

}
