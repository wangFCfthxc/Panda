package tw.org.iii.YEAR;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Hello46 {

	public static void main(String[] args) {
		try {
			DataInputStream din =
					new DataInputStream(new FileInputStream("dir1/data.dat"));
			int data1 = din.readInt();
			boolean data2 = din.readBoolean();
			double data3 = din.readDouble();
			int data4 = din.readInt();

			din.close();
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
			System.out.println(data4);
		} catch (Exception e) {
			
		}

	}

}
