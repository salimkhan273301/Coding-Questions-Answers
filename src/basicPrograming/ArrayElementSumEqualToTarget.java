package basicPrograming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayElementSumEqualToTarget {

	public static void main(String[] args) {
		int arr[]= {2,3,5,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target number:");
		int n=sc.nextInt();
		
		elementPair(arr,n);

	}
// 1st Approach................

	private static void elementPair(int[] arr, int target) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for (int i=0; i<arr.length; i++) {
			if(map.containsKey(target-arr[i]))
				System.out.printf("\nPair found (%d, %d)",arr[map.get(target - arr[i])], arr[i]);
			else
				map.put(arr[i], i);
		}
		
		
	}
	
	
	// 2rd Approach.......
	
	/*
	 * private static void elementPair(int[] arr, int n) { for(int i=0;
	 * i<arr.length; i++) { for(int j=0; j<arr.length; j++) { if(arr[i]+arr[j]==n)
	 * System.out.format("\n%d +  %d = %d",arr[i],arr[j],n); } }
	 * 
	 * }
	 */

	
	//2nd Approach..............
	
	
	/*
	 * private static void elementPair(int[] arr, int n) { Arrays.sort(arr); int
	 * i=0; int j=arr.length-1;
	 * 
	 * while(i<=j) { 
	 * if(arr[i]+arr[j]==n) { 
	 * System.out.format("\n%d +  %d = %d",arr[i],arr[j],n);
	 *  i++; j--; } 
	 *  else if(arr[i]+arr[j]>n) { j--; }
	 *   else { i++; }
	 * 
	 * }
	 * 
	 * }
	 */
}
