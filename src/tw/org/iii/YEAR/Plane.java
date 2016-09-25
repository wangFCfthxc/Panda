package tw.org.iii.YEAR;

class Plane extends Vehicle{
	protected int flight;
	
	public Plane(int f){
		flight = f;
		System.out.println("生產了" + flight + "班次的飛機");
	}

	@Override
	void show() {
		System.out.println("飛機的班次是" + flight);
		System.out.println("速度是" + speed);
		
	}
	
}
