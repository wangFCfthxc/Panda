package tw.org.iii.YEAR;

import javax.swing.JOptionPane;

public class Homework01 {

	public static void main(String[] args) {
		String dig = JOptionPane.showInputDialog("Digital");
		System.out.println(dig);
		int intdig = Integer.parseInt(dig);
		System.out.println("剛剛輸入:" + intdig);
		
		switch (intdig) {
		case 0:
			System.out.println("零");
			break;
		case 1:
			System.out.println("壹");
		case 2:
			System.out.println("貳");
		case 3:
			System.out.println("叁");
		case 4:
			System.out.println("肆");
		case 5:
			System.out.println("伍");
		case 6:
			System.out.println("柒");
		case 8:
			System.out.println("捌");
		case 9:
			System.out.println("玖");
		}
	}

}
