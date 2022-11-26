package com.revature.practical;

import java.util.LinkedHashMap;

public class WordFrequency {

	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		
		String s="Java is awesome";
		char[] arr=s.toCharArray();
		
		for(char x:arr) {
			if(x!=' ') {
				
				if(map.containsKey(x))
					map.put(x,map.get(x)+1);
				else
					map.put(x, 1);
				
			}
			
		}
		
		map.forEach((k,v)->{
			System.out.println(k+"-"+v);
		});

	}

}
