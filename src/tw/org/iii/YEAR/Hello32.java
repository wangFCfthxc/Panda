package tw.org.iii.YEAR;

public class Hello32 {

	public static void main(String[] args) {
		Hello321 obj1 = new Hello321();
		Hello322 obj2 = new Hello323();
		Hello323 obj3 = new Hello323();
		Hello323 obj4 = (Hello323)obj2;
		obj4.m3();
	}
}
class Hello321 {
	void m1(){}
	void m2(){}
}
abstract class Hello322 {
	Hello322(){System.out.println("Hello322()");}
	void m1(){System.out.println("Hello322:m1()");}
	abstract void m2();
}
class Hello323 extends Hello322{
	void m2(){System.out.println("Hello322:m2()");}
	void m3(){System.out.println("Hello322:m3()");}
}
final class hello324 {
	
}