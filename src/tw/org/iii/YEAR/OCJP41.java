package tw.org.iii.YEAR;

public class OCJP41 {

	public static void main(String[] args) {
		Integer i1 = 127;
		Integer i2 = i1;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		i1++; i2++;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

	}

}
