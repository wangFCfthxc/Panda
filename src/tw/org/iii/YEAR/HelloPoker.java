package tw.org.iii.YEAR;

import java.util.*;

public class HelloPoker {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[52]; // 0,0,...0
		for (int i = 0; i < poker.length; i++) {
			int rand;
			boolean isOK;
			do {
				rand = (int) (Math.random() * poker.length);
				// 檢查機制
				isOK = true;
				for (int j = 0; j < i; j++) {
					if (poker[j] == rand) {
						isOK = false;
						break;
					}
				}
			} while (!isOK);
			poker[i] = rand;
			//System.out.println(poker[i]);
		}
			// int rand = (int) (Math.random() * poker.length);
			// // 檢查機制
			// boolean isOK = true;
			// for (int j = 0; j < i; j++) {
			// if (poker[j] == rand) {
			// isOK = false;
			// break;
			// }
			// }
			// if (!isOK){
			// i--;
			// continue;
			// }
			// poker[i] = rand;
			// System.out.println(poker[i]);
			// }

			// 發牌 => 4個玩家
			int[][] player = new int[4][13];
			for (int i=0; i<poker.length; i++){
				player[i%4][i/4] = poker[i];
			}
			
		
			System.out.println("======");
			// 理牌 => 攤牌
			String[] suit = {"黑桃","紅心","方塊","梅花"};
			String[] value = {"A", "2", "3", "4", "5", "6", "7", "8","9", "10", "J", "Q" , "K"};
			for (int[]cards : player){
				Arrays.sort(cards);
				for (int card : cards){
					System.out.print(suit[card/13] + value[card%13] +" ");
				}
				System.out.println();
		}

	}
}