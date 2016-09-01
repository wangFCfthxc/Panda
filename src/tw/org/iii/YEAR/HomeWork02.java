package tw.org.iii.YEAR;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javafx.embed.swing.JFXPanel;

public class HomeWork02 extends JFrame {

	private JButton Go;
	private JTextArea edit;
	private JTextField input;

	public HomeWork02() {
		super("My Window");

		// 按鈕.顯示.輸入
		Go = new JButton("猜");
		edit = new JTextArea();
		input = new JTextField(50);

		// 放入元件
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		top.add(input);
		top.add(Go);
		add(edit, BorderLayout.CENTER);
		add(top, BorderLayout.NORTH);

		// 顯示.視窗大小.關閉
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 謎底
		String answer = createAnswer(3);
		System.out.println(answer);
		
		// 輸入猜
		// 過程記錄
		
		// 對>過關.結束
		
		// 錯>提示XAXB
		// 錯10次>失敗.公布答案.結束

	}

	static String createAnswer(int n){
		// 洗牌
		int[] poker = new int[n];	// 0,0,...0
		int rand;
		boolean isOK;
		for (int i=0; i<poker.length; i++){
			
			do {
				rand = (int)(Math.random()*10);
				// 檢查機制
				isOK = true;
				for (int j=0;j<i;j++){
					if (poker[j]==rand){
						isOK = false;
						break;
					}
				}
				
			}while (!isOK);
			
			poker[i] = rand;
			//System.out.println(poker[i]);
		}
		String ret = "";
		for (int v : poker) ret += v;
		
		return ret;
	}

	public static void main(String[] args) {
		new HomeWork02();
	}
}