package com.revature.practical;

import java.util.Arrays;

public class AnagramsOrNot {

	public static void main(String[] args) {
		 isAnagram("Mother In Law", "Hitler Woman");
		 
	        isAnagram("keEp", "peeK");
	 
	        isAnagram("SiLeNt CAT", "LisTen AcT");
	 
	        isAnagram("Debit Card", "Bad Credit");
	 
	        isAnagram("School MASTER", "The ClassROOM");
	 
	        isAnagram("DORMITORY", "Dirty Room");
	 
	        isAnagram("ASTRONOMERS", "NO MORE STARS");
	 
	        isAnagram("Toss", "Shot");
	 
	        isAnagram("joy", "enjoy");

	}

	private static void isAnagram(String s1, String s2) {
		
		String s3 = s1.replaceAll("\\s", "");
		 
        String s4 = s2.replaceAll("\\s", "");
		char[] arr1=s3.toLowerCase().toCharArray();
		char[] arr2=s4.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		
	}

}
