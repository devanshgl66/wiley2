package wileyfirstproject;
class Base{
	void func() {
		System.out.println("Base class");
	}
}
public class thiskeyword {
	int a=10;
	int b=20;
	thiskeyword(){
		this(4,5);
		System.out.println("constructor without parameter");
		
	}
	thiskeyword(int a,int b){
		System.out.println("constructor with parameter");
		
	}
	void func(int a,int b) {
		System.out.println(a+" "+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args) {
		thiskeyword obj=new thiskeyword();
		obj.func(5, 7);
	}

}
