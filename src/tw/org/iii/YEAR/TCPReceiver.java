package tw.org.iii.YEAR;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import com.sun.corba.se.spi.activation.Server;

public class TCPReceiver {

	public static void main(String[] args) {

		try {
			ServerSocket sever = new ServerSocket(6666);
			Socket socket = sever.accept();
			
			BufferedInputStream bin =
					new BufferedInputStream(socket.getInputStream());
			BufferedOutputStream bout =
					new BufferedOutputStream(
							new FileOutputStream("upload/Panda.jpg"));
			int b;
			while ((b = bin.read()) != -1){
				bout.write(b);
			}
			
			bin.close();
			bout.flush();
			bout.close();
			sever.close();
			
			System.out.println("Rec Ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
