package tw.org.iii.YEAR;

public class Hello24 {

	public static void main(String[] args) {
		String a = "0123";
		System.out.println(a.concat("Hello"));
		System.out.println(a);
		System.out.println(a.replace('2', 'k'));
		System.out.println(a);
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("12345678901234568901234567890123456");
		System.out.println(sb1.capacity());
		sb1.append("12345678901234568901234567890");
		System.out.println(sb1.capacity());

	}

}
