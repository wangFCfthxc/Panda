package tw.org.iii.YEAR;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Hello45 {

	public static void main(String[] args) {
		int a = 123;
		boolean b = true;
		double c = 12.3;
		int d = 456;
		try {
			DataOutputStream dout =
					new DataOutputStream(new FileOutputStream("dir1/data.dat"));
			dout.writeInt(a);
			dout.writeBoolean(b);
			dout.writeDouble(c);
			dout.writeInt(d);
			dout.flush();
			dout.close();
		} catch (Exception e) {
			
		}

	}

}
