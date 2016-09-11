package tw.org.iii.YEAR;

import java.util.HashMap;

public class Hello59 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("uesname", "Panda");
		map.put("Stage", "3");
		map.put("gender", "male");
		System.out.println(map.get("Stage"));
	}

}
