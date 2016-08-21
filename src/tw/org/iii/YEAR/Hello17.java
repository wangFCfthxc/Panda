package tw.org.iii.YEAR;

public class Hello17 {

	public static void main(String[] args) {
		Bike myBike, urBike;
		myBike = new Bike();
		urBike = new Bike();
		System.out.println(myBike.getSpeed());
		System.out.println(urBike.getSpeed());
		
		System.out.println("------");
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		
		urBike.upSpeed();
		urBike.upSpeed();
		urBike.upSpeed();
		urBike.downSpeed();
		System.out.println("myBike:" + myBike.getSpeed());
		System.out.println("urBike:" + urBike.getSpeed());

	}

}
