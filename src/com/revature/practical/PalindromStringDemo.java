package com.revature.practical;

public class PalindromStringDemo {

	public static void main(String[] args) {
		
		String s="roor";
		
		boolean b=palindromStr(s);
		if(b)
			System.out.println("---Palindrom---");
		else
			System.out.println("Not a Palindrom");

	}

	private static boolean palindromStr(String s) {
		String s1=s.replaceAll("\\s+", "").toLowerCase();
		char[] arr=s1.toCharArray();
		int i=0; 
		int j=arr.length-1;
		while(i<=j) {
			if(arr[i]!=arr[j])
				return false;
			else {
				i++;
				j--;
			}
		}
		
		
		return true;
	}

}
