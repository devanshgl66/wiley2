package DSAQuestions;

import java.util.*;
public class XORquestion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int res=a^b;
	int count=0;
	//fastest way to count number of bit set in a number
	while(res>0) {
		res=res&(res-1);
		count++;
	}
	System.out.println(count);
}
}
