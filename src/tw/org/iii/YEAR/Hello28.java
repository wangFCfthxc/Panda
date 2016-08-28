package tw.org.iii.YEAR;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Hello28 {

	public static void main(String[] args) {
		Hello284 car = new Hello284();
		Hello282 t1 = new Hello282();
		Hello283 t2 = new Hello283();
		car.m1(t2);
	}
}
interface Hello281 {
	void m1();
	void m2();
}
class Hello282  implements Hello281{
	public void m1(){System.out.println("Hello282:m1()");}
	public void m2(){System.out.println("Hello282:m2()");}
	void m3(){System.out.println("Hello282:m3()");}
}
class Hello283  implements Hello281{
	public void m1(){System.out.println("Hello283:m1()");}
	public void m2(){System.out.println("Hello283:m2()");}
	void m4(){System.out.println("Hello283:m4()");}
}
class Hello284 {
	void m1(Hello281 obj1){
		obj1.m1();
		obj1.m2();
		
	}
}