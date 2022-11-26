package com.revature.practical;

public class VowelReplaceDemo {

	// first Approach......
	public static void main(String[] args) {
		String s="porkodi";
		s=s.replace("a", "A");
		s=s.replace("e", "E");
		s=s.replace("o", "O");
		s=s.replace("i", "I");
		s=s.replace("u", "U");
		
		System.out.println(s);
	
		
		
		
	// 2nd Approach......	
		System.out.println("=====================2nd Approach================");
		
		String s1=replaceVowel(s);
		
		System.out.println(s1);
		
	}

	private static String replaceVowel(String s) {
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u') {
				String s1=String.valueOf(c).toUpperCase();
				char c1=s1.charAt(0);
				
						
						s=s.replace(c,c1);
			}
		}
		return s;
	}
	
	
	
	

}
