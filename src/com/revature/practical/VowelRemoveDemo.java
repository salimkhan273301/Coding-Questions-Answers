package com.revature.practical;

public class VowelRemoveDemo {

	public static void main(String[] args) {
		String s="Salim";
		/*
		 * String s1=s.replaceAll("[aeiou]", ""); System.out.println(s1);
		 */
		
	String s1=	removeVowel(s);
	System.out.println(s1);
	}

	private static String removeVowel(String s) {
		char arr[]=s.toLowerCase().toCharArray();
		String s2="";
		for (char c : arr) {
			if(c=='a' || c=='e' || c=='o' || c=='i' || c=='u') {
				continue;
			}
			else 
				s2+=c;
		}
		return s2;
	}

}
