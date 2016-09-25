package tw.org.iii.YEAR;

abstract class Vehicle {
	protected int speed;
	public void setSpeed(int s){
		speed = s;
		System.out.println("將速度設為" + speed + "了");
	}
	abstract void show();
}
