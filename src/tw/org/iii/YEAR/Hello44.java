package tw.org.iii.YEAR;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Hello44 {

	public static void main(String[] args) {
		try {
			FileInputStream fin =
			new FileInputStream("dir1/staff.csv");
			InputStreamReader irs = new InputStreamReader(fin);
			BufferedReader br = new BufferedReader(irs);
			
			String line = br.readLine();
			String[] row = line.split(",");
			for (String data: row){
				System.out.println(data);
			}
			fin.close();			
		} catch (Exception e) {
					
		}
		
		
	}

}
