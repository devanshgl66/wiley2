package wileyfirstproject;
import java.util.*;
public class datastructure {
	static final Scanner sc=new Scanner(System.in);
	static void vector() {
		Vector v2=new Vector(1,4);
		System.out.println(v2);
		Vector v=new Vector();
		v.add(5);
		v.add(10);
		v.add(new Integer(0x5));
		v.add(null);
		v.add("asdf");
		v.add(5,3);
		System.out.println(v);
		System.out.println(v.get(2));
		System.out.println(v.lastIndexOf(5));
		System.out.println(v);
		v.remove(3);	//at position 3
		v.remove(new Integer(3));//element 3
//		v.remove(3);
//		v.removeElementAt(3);
		System.out.println(v);
		ListIterator it=v.listIterator(3);
		System.out.println(it.next());
		System.out.println(it.previous());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vector();
	}

}
