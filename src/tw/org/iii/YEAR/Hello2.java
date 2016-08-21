package tw.org.iii.YEAR;

public class Hello2 {

	public static void main(String[] args) {
		// switch
		int dir = 11;
		final int b = 9;
		switch (dir) {
		case 1:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B1");
			break;
		case b+2:
			System.out.println("B2");
			break;
		default:
			System.out.println("X");
			break;
		}

	}

}
