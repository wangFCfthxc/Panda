package tw.org.iii.YEAR;

public class Hello12 {

	public static void main(String[] args) {
		int[] p = new int[9];
		
		for (int i=0; i<100; i++){
			int point = (int)(Math.random()*9);	// 0 - 5
			p[point]++;
		}
		for (int i=0; i<p.length; i++){			
			System.out.println((i+1) + ":" + p[i]);
		}
}
}
