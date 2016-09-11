package tw.org.iii.YEAR;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.event.ActionEvent;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

public class Racing extends JFrame{
	private JButton go;
	private JLabel[] lanes;
	private Car[] cars;
	private int rank;
	public Racing(){
		setLayout(new GridLayout(9, 1));
		
		add(go = new JButton("Go!"));
		lanes = new JLabel[8];
		for(int i=0; i<lanes.length; i++){
			add(lanes[i] = new JLabel((i+1) + ". "));
		}
		
		setSize(1024, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go();
			}

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	private void go(){
		rank =1;
		Car[] cars = new Car[8];
		for(int i=0; i<lanes.length; i++){
			
		}
		for (int i=0; i<cars.length; i++){
			cars[i] = new Car(i);
		}
		for (int i=0; i<cars.length; i++){
			cars[i].start();
		}
	}
	private class Car extends Thread {
		private int whichLane;
		Car(int n){whichLane = n;}
		@Override
		public void run() {
			for (int i=0; i<100; i++){
				lanes[whichLane].setText(
						lanes[whichLane].getText() + ">");
				if (i==99){
					lanes[whichLane].setText(
							lanes[whichLane].getText() + 
							" >WINNER");
					stopGame();
					break;
				}
				try {
					Thread.sleep((int)(Math.random()*200));
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	private void stopGame(){
		for(int i=0; i<cars.length; i++){
			cars[i].interrupt();
		}
	}

	public static void main(String[] args) {
		new Racing();
	}

}
