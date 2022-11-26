package com.revature.practical;

public class ReverseStringUsingRecurssion {

	public static void main(String[] args) {
		String s="Java is a programming language";
		String s1=reverseStr(s);
		
		String s2=reverseStr1(s);
		
		System.out.println(s1);
		
		System.out.println(s2);

	}

	private static String reverseStr1(String s) {
		char arr[]=s.toCharArray();
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			char c=arr[i];
			arr[i]=arr[j];
			arr[j]=c;
			i++;
			j--;
			
		}
		return (new String(arr));
	}

	// 1st approach.......
	
	private static String reverseStr(String s) {
		
		if(s==null || s.length()<=1)
		return s;
		else
		return	reverseStr(s.substring(1))+s.charAt(0);
	}
	
	

}
