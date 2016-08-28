package tw.org.iii.YEAR;

public class Hello30 {

	public static void main(String[] args) {
		final int d;
		d = 12;
		System.out.println(Hello306.a);
	}
}
interface Hello301 {void m1();}
interface Hello302 {void m2();}
class Hello303 implements Hello301, Hello302 {
	public void m1(){}
	public void m2(){}
}
interface Hello304 extends Hello301{
	void m3();
}
interface Hello305 extends Hello301, Hello302{
	int a = 10;	// public final static
	void m3();	// public
}
class Hello306 implements Hello305{
	int b;
	final int c;
	
	Hello306(){c=12;}
	@Override
	public void m1() {
		b++;
	
	}

	@Override
	public void m2() {
		
		
	}

	@Override
	public void m3() {
		
		
	}
	
}