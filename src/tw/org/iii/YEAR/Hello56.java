package tw.org.iii.YEAR;

public class Hello56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface Hello561{
	void m1();
}
interface Hello562{
	void m2();
}

interface Hello563 extends Hello561, Hello562{
	void m3();
}
class Hello564 implements Hello563{
	public void m1(){}
	public void m2(){}
	public void m3(){}	
}






