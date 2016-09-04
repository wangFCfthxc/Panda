package tw.org.iii.YEAR;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hello54 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		while(set.size()<6){
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set);
		System.out.println("---------");
		Iterator it = set.iterator();
		while (it.hasNext()){
			Object obj = it.next();
			System.out.println((Integer)obj);
		}
		System.out.println("----*----");
		for (Object obj : set){
			System.out.println((Integer)obj);
		}
		

	}

}
