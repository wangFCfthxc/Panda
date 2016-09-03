package tw.org.iii.YEAR;

import java.io.File;

public class Hello39 {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for(File root:roots){
			System.out.println(root.getAbsolutePath());
		}
	}

}
