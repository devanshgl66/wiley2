package DSAQuestions;

public class Napsack01 {
	//works
	static int calc2(int cap, int wt[], int val[]) {
		int i, w,n=wt.length;
		int K[][] = new int[n + 1][cap + 1];
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= cap; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}
		return K[n][cap];
	}
	//same and works
	static int calc(int cap,int wt[],int val[]) {
		int mat[][]=new int[wt.length+1][cap+1];
		for(int i=0;i<=wt.length;i++) {
			for(int j=0;j<=cap;j++) {
				if(i==0||j==0)
					mat[i][j]=0;
				else if(wt[i-1]>j)
					mat[i][j]=mat[i][j-1];
				else
					mat[i][j]=Math.max(mat[i][j-1], val[i-1]+mat[i-1][j-wt[i-1]]);
			}
		}
//		for(int []row:mat) {
//			for(int value:row)
//				System.out.print(value+" ");
//			System.out.println();
//		}
		return mat[wt.length][cap];
	}

	public static void main(String[] args) {
//		int weight[] = { 10, 20, 30 };
//		int val[] = { 60,100,120 };
		int weight[] = { 10, 20, 30 };
		int val[] = { 60,100,120 };
		int cap = 50;
		int maxVal = calc(cap,weight, val);
		System.out.println(maxVal);
	}
}
