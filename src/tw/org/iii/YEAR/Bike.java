package tw.org.iii.YEAR;

public class Bike {
	// Field屬性
	private double speed;
	static int count;
	
	// Constructor建構式
	public Bike(){
		count++;
		speed = 1;
		System.out.println("Bike():" + speed);
	}
	// Method方法
	protected void upSpeed(){
		speed = speed<1?1:speed*1.2;
	}
	void downSpeed(){
		speed = speed<1?0:speed*0.7;
	}
	double getSpeed(){
		return speed;		
	}
	
}
