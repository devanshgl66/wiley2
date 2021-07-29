package wileyfirstproject;

public class constructor {
	int d=49;
	constructor(){
		this("asfd");
		System.out.println("Constructor");
	}
	constructor(String a){
		System.out.println(a);
	}
	static String name;
	static {	
		name="devansh";
		System.out.println("static block");
	}
	{a=10;}
	int a;
	{
		System.out.println("normal block");
	}
	public static void main(String args[]) {
		System.out.println(name);
		constructor obj=new constructor();
		System.out.println(obj.a);
		constructor obj2=new constructor();
	}
}
