package tw.org.iii.YEAR;

public class Hello15 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[][] b = {{1,2},{3,4,5},{6,7,8,9}};
		int[][][] c = new int[2][2][1];
		c[0][0][0] = 1;
		c[0][1][0] = 2;
		c[1][0][0] = 3;
		c[1][1][0] = 4;
		for (int v: a){
			System.out.println(v);
		}
		System.out.println("----");
		for (int[] v1:b){
			for (int v2:v1){
				System.out.println(v2);
			}
			System.out.println("+++++");
		}
		for (int[][] v1:c){
			for (int[] v2:v1){
				for (int v3:v2){
					System.out.println(v3);
				}
				System.out.println("====");
			}
			System.out.println("**********");
		}

	}

}
