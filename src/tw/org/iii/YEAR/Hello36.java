package tw.org.iii.YEAR;

public class Hello36 {

	public static void main(String[] args) {
		Hello363 obj1 = new Hello363();
		try{
		obj1.m3();
		}catch (Exception ee){
			
		}
	}
}
class Hello361 {
	void m1() throws Exception{
		throw new Exception();
	}
}
class Hello362 extends Hello361 {
	void m2() throws Exception{
		m1();
	}
}
class Hello363 extends Hello362 {
	void m3() throws Exception{
		m2();
	}
}