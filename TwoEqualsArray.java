package com.deccon.company;

public class TwoEqualsArray {
	public static int findMinRec(int arr[], int i, int sumCalculated, int sumTotal) {

		if (i == 0)
			return Math.abs((sumTotal - sumCalculated) - sumCalculated);

		return Math.min(findMinRec(arr, i - 1, sumCalculated + arr[i - 1], sumTotal),
				findMinRec(arr, i - 1, sumCalculated, sumTotal));
	}

	public static int findMin(int arr[], int n) {
		int sumTotal = 0;
		for (int i = 0; i < n; i++)
			sumTotal += arr[i];

		return findMinRec(arr, n, 0, sumTotal);
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 3, 100, 1, 83, 54, 23, 20 };
		int n = arr.length;
		System.out.print("The minimum difference between two sets is " + findMin(arr, n));
	}
}