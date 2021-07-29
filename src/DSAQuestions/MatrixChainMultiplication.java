package DSAQuestions;

import java.util.Arrays;

public class MatrixChainMultiplication {
	int arr[][];

	int mcm(int size[], int i, int j) {
		if (i == j)
			return 0;
		if (arr[i][j] != -1)
			return arr[i][j];
		arr[i][j] = Integer.MAX_VALUE;
		for (int k = i; k < j; k++)
			arr[i][j] = Math.min(arr[i][j],
					mcm(size, i, k) + mcm(size, k + 1, j) + size[i] * size[k + 1] * size[j + 1]);
		return arr[i][j];
	}

	public static void main(String[] args) {
//		int size[]= { 10, 20, 30, 40, 30,10,30,20,10,20,20,10,20,30,40};
		int size[] = { 10, 20, 30, 40, 30, 10, 30, 20, 10, 20, 20, 10, 20, 30, 40, 50, 60, 70, 80, 20, 30, 40, 30, 10,
				30, 10, 30, 20, 10, 20, 20, 10, 20, 30, 40, 50, 60, 70, 80, 30, 10, 30, 20, 10, 20, 20, 10, 20 };
		MatrixChainMultiplication obj=new MatrixChainMultiplication();
		obj.arr = new int[size.length][size.length];
		for (int[] row : obj.arr)
			Arrays.fill(row, -1);
		System.out.println(Arrays.toString(size));
		System.out.println(obj.mcm(size, 0, size.length - 2));
	}
}
