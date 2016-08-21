package tw.org.iii.YEAR;

import javax.swing.JOptionPane;

public class GuessNumber {
	public static void main(String[] args) {
		// 產生謎底
		String answer = createAnswer(3);
		System.out.println(answer);
		boolean isWINNER = false;
		for (int i = 0; i < 10; i++) {
			// 開始猜
			String guess = JOptionPane.showInputDialog("猜吧!");
			// 比對
			if (guess.equals(answer)) {
				// 對了 => 過關
				isWINNER = true;
				JOptionPane.showConfirmDialog(null, "過關");
				break;
			}
			// 錯了 => 提示1A2B
			else {
				String result = checkAB(answer, guess);
				JOptionPane.showConfirmDialog(null, guess + ":" + result);
			}
		}
		if (!isWINNER){
			JOptionPane.showMessageDialog(null,"失敗 , \n答案是:" + answer);
		}
	}

	static String checkAB(String a, String g) {
		int A, B; A = B = 0;
		for (int i=0; i<g.length(); i++){
			if (g.charAt(i) == a.charAt(i)){
				A++;
			}else if (a.indexOf(g.charAt(i)) != -1){
				B++;
			}
		}

		return "1A2B";
	}

	static String createAnswer(int n) {
		int[] poker = new int[n]; // 0,0,...0
		int rand;
		boolean isOK;
		for (int i = 0; i < poker.length; i++) {

			do {
				rand = (int) (Math.random() * 10);
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
			// System.out.println(poker[i]);
		}
		String ret = "";
		for (int v : poker)
			ret += v;
		return ret;
	}
}