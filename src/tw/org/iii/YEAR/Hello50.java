package tw.org.iii.YEAR;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hello50 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = 
					InetAddress.getAllByName("www.microsoft.com");
			// 主機名稱HostName
			for (InetAddress ip : ips){
				System.out.println(ip.getHostAddress());
			}
			
		} catch (UnknownHostException ue) {
			System.out.println("X");
		}

	}

}
