package wileyfirstproject;

import java.util.*;

public class MinimumAbsoluteSum {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=9;
		int arr[] = { -26, -6, -3, 1, 2, 3, 5, 34, 88 };
		method1(arr);
		method2(arr);
	}

	static void method1(int arr[]) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//finding max index of -ve number
		int idx=0;
		while(idx<arr.length && arr[idx]<0)
			idx++;
		if(idx==arr.length) {
			//all number are -ve
			System.out.println((arr[idx-1]+arr[idx-2])*-1);
			return;
		}
		else if(idx==0) {
			//all +ve number
			System.out.println((arr[idx]+arr[idx+1]));
			return;
		}
		else {
			//both +ve and -ve
			int a=arr[idx-1];
			int min=Integer.MAX_VALUE;
			if(idx>2)
				min=Math.abs(arr[idx-1]+arr[idx-2]);
			for(int i=0;i<idx;i++) {
				//for every -ve number find its min
				int x=Integer.MAX_VALUE;
				for(int j=idx;j<arr.length;j++) {
					int y=Math.abs(arr[i]+arr[j]);
					if(x>y)
						x=y;
					else
						break;
				}
				if(min>x)
					min=x;
					
			}
//			while(true) {
//				int x=Math.abs(arr[idx]+a);
//				if(x>min)
//					break;
//				min=x;
//				idx++;
//			}
			System.out.println(min);
		}
	}
	static void method2(int arr[]) {
//		List<Integer> li=new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> al = new ArrayList<Integer>();
		for(int a:arr)
			al.add(a);
//		Collections.addAll(li,arr);
		al.sort((a,b)->Math.abs(a)-Math.abs(b));
		System.out.println(al);
		int min=Integer.MAX_VALUE;
		for(int i=1;i<al.size();i++) {
			if(min>Math.abs(al.get(i)+al.get(i-1)))
				min=Math.abs(al.get(i)+al.get(i-1));
		}
		System.out.println(min);
	}
}
