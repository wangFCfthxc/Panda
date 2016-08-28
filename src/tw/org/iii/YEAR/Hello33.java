package tw.org.iii.YEAR;

public class Hello33 {

	public static void main(String[] args) {
		Hello331 obj1 = new Hello331();
		Hello332 obj2 = new Hello332();
		Hello331 obj3 = new Hello332();
//		Hello332 obj4 = new Hello331();
		obj1.m1();
		obj2.m1();
		obj3.m1();

	}
}
class Hello331 {
	int a = 1;
	void m1(){System.out.println("Hello331:m1()" + a);}
}
class Hello332 extends Hello331 {
	int a = 2;
	void m1(){System.out.println("Hello332:m1()" + a);}
	void m2(){System.out.println("Hello332:m2()");}
}