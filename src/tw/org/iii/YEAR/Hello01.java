package tw.org.iii.YEAR;
// 測試一下
public class Hello01 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int c = a & b;
		System.out.println(c);
		
		if(--a >= 10 & b++ <= 3){
			System.out.println("OK:a=" + a + ",b=" + b);
		}else{
			System.out.println("XX:a=" + a + ",b=" + b);
		}
	}

}
