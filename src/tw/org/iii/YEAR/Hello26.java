package tw.org.iii.YEAR;

public class Hello26 {

	public static void main(String[] args) {
		Hello262 obj1 = new Hello262();
//		obj1.m1();
		obj1.m1(3);
//		obj1.m2();

	}
}
class Hello261 {
	int a;
	void m1(){System.out.println("Hello261:m1()");a++;}
}
class Hello262 extends Hello261{
	int a;
//	void m1(){
//		super.m1();
//		System.out.println("Hello262:m1()");
//	}
	void m1(int a){
		System.out.println(super.a);
		System.out.println(this.a);
		super.m1();
		System.out.println(super.a);
		System.out.println(this.a);
		a++;
		System.out.println("-----");
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println(a);
//		System.out.println("Hello262:m1(int)" + this.a++);
	}
	void m2(){System.out.println("Hello262:m2()");}
}