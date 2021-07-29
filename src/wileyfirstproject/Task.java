package wileyfirstproject;
import java.util.*;
interface Inter{
	int a=4;
	default void f() {
		int a=3;
		System.out.println(a);
	}
}
class Av implements Inter{
	static int b=4;
	Av() {
		System.out.println(a+" "+b);
	}
}

public class Task extends Av{
	static Scanner sc=new Scanner(System.in);
	int id;
	String name;
	Task(int id,String name){
		this.id=id;
		this.name=name;
	}
	Task(){
		this(1,"sadf");
//		super();
		
	}
	void disp() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println(this);
	}
	public static void main(String[] args) {
		int i=new Integer(1);
		int j=new Integer(1);
		System.out.println(i==j);
		System.out.println("Enter Name: ");
		String name=sc.next();
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		Task t=new Task(id,name);
		t.disp();
		t.f();
		System.out.println(t);
		String a="afd";
		String b="afd";
		String c=new String("afd");
		String d=new String("afd");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
	}

}
