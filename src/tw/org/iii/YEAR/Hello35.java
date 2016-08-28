package tw.org.iii.YEAR;

import javax.management.RuntimeErrorException;
import javax.xml.datatype.DatatypeConfigurationException;

import sun.security.util.PropertyExpander.ExpandException;

public class Hello35 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try{
			b1.setleg(0);
			System.out.println(b1.leg);
		}catch(RuntimeException re){
			System.out.println("XX");
		}
		
		Hello351 obj1 = new Hello351();
		try{
			obj1.m1(2);
		}catch(IllegalAccessException ie){
			
		}catch(DatatypeConfigurationException re){
			
		}
		Hello352 obj2 = new Hello352();
		obj2.m1(1);
	}
}
class Bird {
	int leg;
	void setleg(int n){
		if (n<0 || n>2){
			throw new RuntimeException();
		}
		leg = n;
	}
}

class Hello351 {
	void m1(int n) throws IllegalAccessException, DatatypeConfigurationException{
		if (n<0){
				throw new IllegalAccessException();			
		}else if (n>100) {
			throw new DatatypeConfigurationException();
		}
	}
}
class Hello352 extends Hello351 {
	void m1(int n) {
		int a =10, b = 3;
		try{
			int c = a / b;
			return;
		}catch (RuntimeErrorException re){
			System.out.println("catch");
		}finally {
			System.out.println("finally");
		}
		System.out.println("OK");
	}
}