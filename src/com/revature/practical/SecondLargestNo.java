package com.revature.practical;

public class SecondLargestNo {

	public static void main(String[] args) {
		int[] arr= {1,4,7,9,10,11,15,28,30};
		int second_largest=secoundlargest(arr);
		System.out.println("Second Largest No :"+second_largest);

	}

	private static int secoundlargest(int[] arr) {
		int fl,sl=0;
		
		if(arr[0]>arr[1] ) {
			fl=arr[0];
			sl=arr[1];
			
			
		}
		else {
			fl=arr[1];
			sl=arr[0];
		}
		for(int i=2; i<arr.length; i++) {
			if(arr[i]>fl) {
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]<fl && arr[i]>sl) {
				sl=arr[i];
				
			}
		}
		
		
		return sl;
	}

}
