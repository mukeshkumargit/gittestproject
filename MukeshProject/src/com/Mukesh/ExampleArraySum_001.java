package com.Mukesh;

public class ExampleArraySum_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5 };
		int sum = sumOfArray(a);
		System.out.println(sum);

	}

	private static int sumOfArray(int[] a) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
//			0+1=1
//			1+2=3
//			3+3=6
//			6+4=10
//			10+5=15
		}
		return sum;
	}

}
