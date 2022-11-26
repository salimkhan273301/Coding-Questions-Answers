package com.revature.practical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Revature1stOccuranceofRepeatedChar {

	public static void main(String[] args) {

		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		
		String s="Java is awesome".toLowerCase();
		char[] arr=s.toCharArray();
		for(char x:arr) {
			if(x!=' ') {
				if(map.containsKey(x))
					map.put(x, map.get(x)+1);
				else
					map.put(x, 1);
			}
		}
		
		map.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		
		// for first non repeating char...
		
		for(Map.Entry<Character, Integer> e:map.entrySet()) {
			
			if(e.getValue()==1) {
				System.out.println("First non-reapeting character : "+e.getKey());
			break;}
		}
		
		
		System.out.println("========================================================");
		
		// for first repeating char...
		
				for(Map.Entry<Character, Integer> e:map.entrySet()) {
					
					if(e.getValue()>1) {
						System.out.println("First reapeting character : "+e.getKey());
					break;
					}
				};
				

	}


	

}
