package com.revature.practical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyOfString {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		String s="java is a very good programming language java is very easy language"
				+" java is a very good programming language "+"java is used in backend logic";

		String[] arr=s.split(" ");
		//System.out.println(Arrays.toString(arr));
		
		for (String x : arr) {
			
			if(map.containsKey(x))
				map.put(x, map.get(x)+1);
			else
				map.put(x, 1);
			
		}
		
		map.forEach((k,v)->{
			System.out.println(k+"-"+v);
		});
	}

}
