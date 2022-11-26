package stringDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharactorOccuranceDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		String s="Java is a programming language";
		
		
		
		char[] arr=s.toLowerCase().toCharArray();
		
		
		
		for(char y:arr) {
			if(y!=' ') {
			if(map.containsKey(y)) 
				map.put(y, map.get(y)+1);
			
			
			
			else 
				map.put(y, 1);
			
			}
		}
		
		map.forEach((k,v)->{
			System.out.println(k+"-"+v);
			
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
					break;}
				}
				;

	}

}
