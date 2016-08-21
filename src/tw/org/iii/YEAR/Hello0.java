package tw.org.iii.YEAR;

public class Hello0 {

	public static void main(String[] args) {
		int Year = 2016;
		System.out.println(Year);
		if (Year % 4 == 0){
			if (Year % 100 == 0){
				if (Year % 400 == 0){
					System.out.println("閏年");// 29
				}else{
					System.out.println("非閏年");// 28
				}
			}else{
				System.out.println("閏年");// 29
			}
		}else{
			System.out.println("非閏年");// 28
		}

	}

}
