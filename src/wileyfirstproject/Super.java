package wileyfirstproject;
class Aaa{
	int a;
	Aaa(){
		a=5;
	}
}
class Bbb extends Aaa{
	int b;
	Bbb(){		
	}
	Bbb(int c){
		this();
		b=c;
	}
	void func() {
		System.out.println("Inside func of Bbb");
	}
}
public class Super extends Bbb{
	int roll;
	String name;
	Super(){
		this(0,"");
	}
	Super(int r,String s){
		roll=r;
		name=s;
	}
	void func() {
		super.func();
		System.out.println("Inside func of Super");
	}
	void func2() {
		this.func();
		func();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s=new Super();
		s.func();
		
	}

}
