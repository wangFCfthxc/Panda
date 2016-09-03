package tw.org.iii.YEAR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Hello40 {

	public static void main(String[] args) {
		File f1 = new File("dir1/Hello01.txt");
		long len = f1.length();
		try {
			FileInputStream fin = new FileInputStream(f1);
			
			int c ; byte[] temp = new byte[(int)len];
			fin.read(temp);
			System.out.println(new String(temp));
//			while ( (c = fin.read(temp)) != -1 ){
//				System.out.print(new String(temp,0,c));
//			}
			fin.close();
			
		} catch (FileNotFoundException fe) {
			System.out.println(fe.toString());
		} catch (IOException fe) {
			System.out.println(fe.toString());
		}
	}

}
