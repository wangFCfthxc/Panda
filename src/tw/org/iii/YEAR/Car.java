package tw.org.iii.YEAR;

class Car extends Vehicle{
	protected int num;
	protected double gas;
	
	public Car(int n ,double g){
		num = n;
		gas = g;
		System.out.println("生產了車號為:" + num + "\n" + "汽油量為:" + gas + "的車子");
	}

	@Override
	void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("速度是" + speed);		
	}
}
