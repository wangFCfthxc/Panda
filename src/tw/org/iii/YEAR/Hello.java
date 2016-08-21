package tw.org.iii.YEAR;

public class Hello {

	public static void main(String[] args) {
		int Year = 1900;
		System.out.println("西元"+Year+"年");
		int A = Year % 4;
		int B = Year % 100;
		int C = Year % 400;
		if (A > 0)
			System.out.println("非閏年");
		else if (B > 0)
			System.out.println("閏年");
		else if (C > 0)
			System.out.println("非閏年");
		else
			System.out.println("閏年");
		
			
	}

}