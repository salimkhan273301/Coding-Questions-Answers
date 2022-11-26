package DemoofDiffrentthings;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) {
		/*
		 * int[][] arr= {{1,2,3,34},{4,5,6,11},{7,8,9,10}}; for(int i=0; i<arr.length;
		 * i++) { for(int j=0; j<arr[i].length; j++) { System.out.print(arr[i][j]+" ");
		 * } System.out.println(); }
		 */
		
		int[] arr= {3,5,7,9,11,44,33,23,76,88};
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 2nd largest Logic  
		
		int i=secondLar(arr);
		System.out.println("Second_Largest_No:"+i);
	}

	private static int secondLar(int[] arr) {
		int fl,sl;
		if(arr[0]>arr[1]) {
			
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
