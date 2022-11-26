package com.revature.practical;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class WordFrequencyInaFile {

	public static void main(String[] args) throws IOException {
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		File file=new File("C:\\Users\\ulla ulla\\Desktop\\File\\salim.txt");
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		String s=null;
		while((s=br.readLine())!=null) {
			
			//System.out.println(s);
			String s1=s.replace("[.,+===]", "");
			String arr[]=s1.split("[' '\t.,]");
			//System.out.println(Arrays.toString(arr));
			for (String x : arr) {
				if(x!=" ") {
					if(map.containsKey(x))
						map.put(s1, map.get(x)+1);
					else
						map.put(x, 1);
					
				}
				
			}
			System.out.println(map);
			
		}
		
		

	}

}
