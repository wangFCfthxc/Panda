package tw.org.iii.YEAR;

public class Hello34 {
	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] c = { 1, 2, 3 };
		try {
			System.out.println(a / b);
			System.out.println(c[3]);
		} catch (ArithmeticException ae) {
			System.out.println("Hello");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("III");
		} catch (RuntimeException re) {
			System.out.println("Big");

		}
		System.out.println("OK");
	}
}
