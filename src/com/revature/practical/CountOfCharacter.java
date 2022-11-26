package com.revature.practical;

//Count of character 'a' in a string
public class CountOfCharacter {

	public static void main(String[] args) {
		String s="java is a programming language";
		int count = 0;
		char[] arr=s.toCharArray();
		for (char c : arr) {
			
			if(c=='a')
				count++;
		}
		System.out.println("No of Occurance Of a : "+count);
	}

}
