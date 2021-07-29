package wileyfirstproject;

abstract class Aa{
	abstract void func1();
	abstract void func2();
}
//developer 1
abstract class Aa1 extends Aa{
	void func1() {
		System.out.println("Developer 1");
	}
}
//developer 2
abstract class Aa2 extends Aa{
	void func2() {
		System.out.println("Developer 2");
	}
}

class Employee{
}
public class Experiment {
	
	public static void main(String[] args) {
		
		
	}

}
