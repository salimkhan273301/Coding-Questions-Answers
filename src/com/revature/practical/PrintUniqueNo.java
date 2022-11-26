package com.revature.practical;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintUniqueNo {

	
	
	public static void main(String[] args) {
		
	//	1st approach..................
	LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
	int[] arr={1,2,3,2,4,1,4};
	
	for(int x:arr) {
		
			
			if(map.containsKey(x))
				map.put(x,map.get(x)+1);
			else
				map.put(x, 1);
			
		
		
	}
	
	for(Map.Entry<Integer,Integer> e:map.entrySet()) {
		
		if(e.getValue()==1)
			System.out.println(e.getKey());
	}
	
	
	
	
	
	int arr1[]= {1,2,3,4,4,3};
	// 3rd approach......
	
		Arrays.stream(arr1).distinct().forEach(System.out::println);
		
		// 2nd Approach...................................	
		
	uniqueElm(arr1);
	
	System.out.println(Arrays.toString(arr1));
	for(int x:arr1) {
		if(x>0)
			System.out.println(x);
	}
	
	
	
	}

	private static void uniqueElm(int[] arr) {
		int i;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for( i=0; i<arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				arr[i]=0;
				arr[i+1]=0;
			}
			}
				
				
		}

		
		
	

}
