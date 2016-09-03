package tw.org.iii.YEAR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Hello42 {

	public static void main(String[] args) {
		File f1 = new File("dir1/Hello03.txt");
		try {
			FileOutputStream fout = new FileOutputStream(f1, true);
			fout.write("中文\r\n".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}