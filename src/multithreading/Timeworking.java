package multithreading;
class nanothread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		long nt1=System.nanoTime();
		for(int i=0;i<25;i++)
			System.out.println("Nanothread");
		long nt2=System.nanoTime();
		System.out.println(nt2-nt1);
	}
}
public class Timeworking  {
	
	public static void main(String[] args) {
		
	}
}
