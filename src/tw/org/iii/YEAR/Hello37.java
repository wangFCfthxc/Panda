package tw.org.iii.YEAR;

import java.io.File;
import java.io.IOException;

public class Hello37 {

	public static void main(String[] args) {
		File f1 = new File("dir1/Hello02.txt");
		if (f1.isFile()){
			System.out.println("exist");
		}else{
			try {
				if (f1.createNewFile()){
					System.out.println("create ok");
				}else{
					System.out.println("create fail");
				}
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}

}
