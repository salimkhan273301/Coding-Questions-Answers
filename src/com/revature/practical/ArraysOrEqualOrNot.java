package com.revature.practical;

import java.util.Arrays;

public class ArraysOrEqualOrNot {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int[] arr2= {5,4,3,2,1};
		boolean b1=checkEquality1(arr1,arr2);
		boolean b=checkEquality(arr1,arr2);
		
		
		System.out.println("Mathod 2 Result   "+b1);
		
		if(b)
			System.out.println(" Equal ");

		else
			System.out.println("Not_Equal");
	}

	private static boolean checkEquality1(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	private static boolean checkEquality(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean flag=true;
		if(arr1.length==arr2.length) {
			for(int i=0; i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]){
				flag=false;
			}
			}
			
		}
		else {
			flag=false;
		}
		
		return flag;
	}

}
