package tw.org.iii.YEAR;

public class Hello23 {

	public static void main(String[] args) {
		Hello232 obj2 = new Hello232("3");
	}
}
class Hello231{
//	Hello231(){
//		System.out.println("A");
//	}
	Hello231(int a){
		System.out.println("B");
	}
//	Hello231(byte a){
//		System.out.println("C");
//	}
}
class Hello232 extends Hello231{
	Hello232(){
		// super();
		super(1);
		System.out.println("D");
	}
	Hello232(int a){
		// super();
		this();
		System.out.println("E");
	}
	Hello232(String b){
		this(1);
		System.out.println("F");
	}
	
}