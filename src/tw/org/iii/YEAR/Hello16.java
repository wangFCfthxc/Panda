package tw.org.iii.YEAR;

public class Hello16 {

	public static void main(String[] args) {
		int i=0, sum = 0, n = 10;
//		while (i<10){
//			System.out.println(i++);
//		} 
//		for (;i<10;){
//			System.out.println(i++);
//		}
		while (i<=n){
			sum += i++;
		}
		System.out.println("1 + 2 + ... + " + n + "=" + sum);
	}

}
