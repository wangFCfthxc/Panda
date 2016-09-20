package tw.org.iii.YEAR;

import java.util.Iterator;
import java.util.LinkedList;

public class Hello55 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(12);
		list.add("Panda");
		list.add("Panda");
		list.add(12);
		list.add(2,"iii");
//		list.add(5,34);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(4));
		list.remove(4);
		System.out.println(list);
		System.out.println("-----");
		Iterator it = list.iterator();
		while (it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println("------");
		for(Object obj : list){
			System.out.println(obj);
		}
	}

}
