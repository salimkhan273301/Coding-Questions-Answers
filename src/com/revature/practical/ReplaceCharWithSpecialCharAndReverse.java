package com.revature.practical;
//Reverse a string and replace char 'a' with '@'.(Ex:  i/p: vijay ,  o/p: y@jiv)
public class ReplaceCharWithSpecialCharAndReverse {

	public static void main(String[] args) {
		String s="Vijay";
		// replace a with @..
		String s1=s.replace('a', '@').toLowerCase();
		String s2=reverseStr(s1);
		System.out.println(s2);

	}

	private static String reverseStr(String s2) {
		if(s2==null || s2.length()<=1) // s2.isEmpty() can be used instead of both..
			return s2;
		return reverseStr(s2.substring(1))+s2.charAt(0);
	}

}
