package tw.org.iii.YEAR;

public class Hello60 {

	public static void main(String[] args) {
		Hello601 obj1 = new Hello601("A");
		Hello601 obj2 = new Hello601("B");
		Hello602 obj3 = new Hello602("C");
		Thread t3 = new Thread(obj3);
		obj1.start();
		obj2.start();
		t3.start();
		try {
			obj2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("main");
//		obj3.start();
	}
}

class Hello601 extends Thread{
	private String name;
	private int delay;
	Hello601(String name, int delay){this.name = name; this .delay = delay;}	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				
			}
		}
	}

}

class Hello602 {
	private String name;
	private int delay;
	Hello602(String name, int delay){this.name = name; this .delay = delay;}	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				
			}
		}
	}

}