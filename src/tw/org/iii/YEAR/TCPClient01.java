package tw.org.iii.YEAR;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient01 {

	public static void main(String[] args) {
		try {
			File sendFile = new File("dir1/1364369005.jpg");
			byte[] sendBuf = new byte[(int)sendFile.length()];
			BufferedInputStream bin =
					new BufferedInputStream(
							new FileInputStream(sendFile));
			bin.read(sendBuf);
			bin.close();
			
			// 2. send by TCP
			Socket client = new Socket(InetAddress.getByName("127.0.0.1"),
					6666);
			BufferedOutputStream bout =
					new BufferedOutputStream(client.getOutputStream());
			bout.write(sendBuf);
			bout.flush();
			bout.close();
			client.close();
			
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}