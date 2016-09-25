package tw.org.iii.YEAR;

public class Sample121 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5);
		vc[0].setSpeed(80);
//		vc[0].show();
		
		vc[1] = new Plane(911);
		vc[1].setSpeed(444);
//		vc[1].show();
		
		for(int i=0; i<vc.length; i++){
			vc[i].show();
		}
		
	}

}
