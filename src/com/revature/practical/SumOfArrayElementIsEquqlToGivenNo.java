package com.revature.practical;

import java.util.Arrays;

public class SumOfArrayElementIsEquqlToGivenNo {
	/*
	 * private static void findThePairs(int[] arr, int n) { 
	 * for(int i=0; i<arr.length; i++) 
	 * {
	 *  for(int j=i+1; j<arr.length; j++) { 
	 * 				if(arr[i]+arr[j]==n)
	 * 
	 * 			System.out.println(arr[i]+"+"+arr[j]+"="+n); } }
	 * 
	 * }
	 */
	

	public static void main(String[] args) {
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		 
        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
 
        findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
 
        findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);

	}

	private static void findThePairs(int[] arr, int n) {
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			if(arr[i]+arr[j]==n) {
				System.out.println(arr[i]+"+"+arr[j]+" = "+n);
			i++;
			j--;}
			else if(arr[i]+arr[j]<n) {
				i++;
			}
			else if(arr[i]+arr[j]>n) {
				j--;
			}
		}
	}

	

}
