package tw.org.iii.YEAR;

import javax.swing.JOptionPane;


public class Hello4 {

	public static void main(String[] args) {
		String strYear = JOptionPane.showInputDialog("Year");
		System.out.println(strYear);
		String strMonth = JOptionPane.showInputDialog("Month");
		System.out.println(strMonth);
		String strDate = JOptionPane.showInputDialog("Date");
		System.out.println(strDate);
		int intYear = Integer.parseInt(strYear);
		int intMonth = Integer.parseInt(strMonth);
		int intDate = Integer.parseInt(strDate);
		System.out.println(intYear + "/" + intMonth + "/" +intDate);
		
	}

}
