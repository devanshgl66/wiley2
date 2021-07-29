package wileyfirstproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeMap;

public class Iterators {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(1);
		arr.add(5);
		arr.add(10);
		arr.add(null);
		arr.add("abc");
		arr.add("def");
		System.out.println(arr);
		Iterator it=arr.iterator();arr.add(it);
		ListIterator it2=arr.listIterator();
//		arr.add("asdf");
		it2.add(it2);
		
		System.out.println(arr);
		System.out.println(it);
		System.out.println(it2);
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		TreeMap t1=new TreeMap();
		System.out.println(t1.get(2));
	}
}
