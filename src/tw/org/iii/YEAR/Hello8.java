package tw.org.iii.YEAR;

public class Hello8 {

	public static void main(String[] args) {
		panda:
		for (int j = 3; j > 0; j--)
			for (int i = 0; i < 3; i++) {
				System.out.println(i + ";" + j);
				if (i == 1) {
					break panda;
				}
			}

	}

}
