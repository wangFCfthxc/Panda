package tw.org.iii.YEAR;

public class Bike {
	// Field
	private double speed;
	static int count;
	
	// Constructor
	public Bike(){
		count++;
		speed = 1;
		System.out.println("Bike():" + speed);
	}
	// Method
	protected void upSpeed(){
		speed = speed<1?1:speed*1.2;
	}
	void downSpeed(){
		speed = speed<0?1:speed*0.7;
	}
	double getSpeed(){
		return speed;		
	}
	
}
