package tw.org.iii.YEAR;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.SocketException;

public class Hello52 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket =
					new DatagramSocket(8888);
			DatagramPacket packet = 
					new DatagramPacket(buf, buf.length);
//			System.out.println("before");
			socket.receive(packet);
//			System.out.println("after");
			socket.close();
			InetAddress urip = packet.getAddress();
			byte[] data = packet.getData();
			int len = packet.getLength();
			System.out.println(urip.getHostAddress() + ":" + new String(data,0,len));
		} catch (Exception e) {
			
		}
	}

}
