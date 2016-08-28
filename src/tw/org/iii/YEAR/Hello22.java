package tw.org.iii.YEAR;

public class Hello22 {

	public static void main(String[] args) {
		TWid id1 = new TWid();
		System.out.println(id1.getid());
		
		if (TWid.isRight(id1.getid())){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
		
		
		
	}

}