package tw.org.iii.YEAR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Hello49 {

	public static void main(String[] args) {
		Hello493 obj = new Hello493();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(
					new FileOutputStream("dir1/Hello49"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK1");
		} catch (Exception e) {
		}
		System.out.println("------");

		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/Hello49"));
			Hello493 obj2 = (Hello493)(oin.readObject());
			oin.close();
			System.out.println("OK2");
		} catch (Exception e) {
		}
		

	}
}
class Hello491 {
	Hello491(){System.out.println("Hello491()");}
}
class Hello492 extends Hello491 {
	Hello492(){System.out.println("Hello492()");}
}
class Hello493 extends Hello492 implements Serializable{
	Hello493(){System.out.println("Hello493()");}
}