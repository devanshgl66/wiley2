package wileyfirstproject;

public class Add {
	static void add(int ...a) {
		int res=0;
		for(int i:a)
			res+=i;
		System.out.println("Addition "+(res));
	}
	static void add(int a ,int b) {
		System.out.println("Addition"+(a+b));
	}
	static void multiply(int a ,int b) {
		System.out.println("Multiply"+(a*b));
	}
	static void subtract(int a ,int b) {
		System.out.println("Subtract"+(a-b));
	}
	static void division(int a ,int b) {
		if(b!=0)
			System.out.println("Division"+(a/b));
		else
			System.out.println("Division not possible");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		add2({1,2,3,4,5});
		add(1,2,3);
		multiply(1,2);
		division(4,2);
		subtract(1,2);
	}

}
