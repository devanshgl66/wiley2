package wileyfirstproject;
import java.util.*;
public class fabonacii {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		int n=sc.nextInt();
//		System.out.println(fab(n));
		fib=new long[n+1];
		System.out.println(fabRec(n));
//		fact=new int[n+1];
//		System.out.println(factorial(n));
//		System.out.println("sadf".);
//		star(n);
//		prime(n);
		
	}
	static void prime(int n) {
		boolean a[]=new boolean[n+1];
		for(int i=2;i<=n;i++) {
			if(a[i]==false) {
				System.out.println(i);
				for(int j=i*2;j<=n;j+=i)
					a[j]=true;
			}
		}
	}
	static void star(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++)
				System.out.print(" ");
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static int fab(int n) {
		int a=0,b=1;
		if(n<=1)
			return n;
		for(int i=1;i<n;i++) {
			int c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	static long fib[];
	static long fabRec(int n) {
		if(n<=1)
			return n;
		if(fib[n]!=0)
			return fib[n];
		fib[n]=fabRec(n-1)+fabRec(n-2);
		return fib[n];
	}
	static int fact[];
	static int factorial(int n) {
		if(n==1)
			return 1;
		if(fact[n]!=0)
			return fact[n];
		fact[n]=n*factorial(n-1);
		return fact[n];
	}
}
