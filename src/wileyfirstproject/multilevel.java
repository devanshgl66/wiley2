package wileyfirstproject;
class A{
	private int a=10;
	
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	void func() {
		System.out.println('A');
	}
}
class B extends A{
	void func() {
		System.out.println('B');
	}
}
public class multilevel {
	public static void main(String args[]) {
		B b=new B();
		A a=(A)b;		
		a.func();
		b.func();
//		(A)obj.func();
	}
}