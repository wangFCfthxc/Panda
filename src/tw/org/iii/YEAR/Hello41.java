package tw.org.iii.YEAR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hello41 {

	public static void main(String[] args) {
		try {
			File f1 = new File("dir1/Hello01.txt");
			FileReader reader = new FileReader(f1);
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
			reader.close();

		} catch (Exception e) {

		}
	}
}
