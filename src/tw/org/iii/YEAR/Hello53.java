package tw.org.iii.YEAR;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import sun.net.URLCanonicalizer;

public class Hello53 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://pdfmyurl.com/?url=http://tw.yahoo.com");
			URLConnection conn = (URLConnection)url.openConnection();
			conn.connect();
//			BufferedReader reader=
//					new BufferedReader(
//						new InputStreamReader(
//							conn.getInputStream()));
//			String line;
//			while((line = reader.readLine()) != null){
//				System.out.println(line);
//			}					
//			reader.close();
			
			InputStream in = conn.getInputStream();
			FileOutputStream fount =
					new FileOutputStream("upload/Panda3.pdf");
			int b;
			while ((b = in.read()) != -1){
				fount.write(b);
			}
			fount.flush();
			fount.close();
			in.close();
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e.toString());
			
		}
	}

}
