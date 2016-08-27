package tw.org.iii.YEAR;

public class Hello25 {

	public static void main(String[] args) {
		
//		Hello251 obj1 = new Hello251();
//		Hello252 obj2 = new Hello252();
		Hello253 obj3 = new Hello253();

	}
}
class Hello251 {
	int a = 12;
	static	{
		System.out.println("Hello251:static{}:");
	}
	{
		System.out.println("Hello251:{}:" + ++a);
	}
	Hello251(){System.out.println("Hello251()");}
	static void m1(){
		System.out.println("Hello251:m1()");
	}
}
class Hello252 extends Hello251{
	Hello252(){System.out.println("Hello252()");}
}
class Hello253 extends Hello252{
	Hello253(){System.out.println("Hello253()");}
}	