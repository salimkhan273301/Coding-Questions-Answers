package com.revature.practical;

public class RemoveAllWhiteSpaceFromString {
	private static String removeWhiteSpace(String s) {
		String s2=s.replaceAll("\\s+", "");
		return s2;
	}
	
	private static String removeWhiteSpace1(String s) {
		String s1="";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ' && s.charAt(i)!='\t') {
				s1+=s.charAt(i);
			}
		}
		return s1;
	}

	public static void main(String[] args) {
		String s="   salim khan is a software devloper and he is searching job     ";
		String s1=removeWhiteSpace(s);
		System.out.println(s1);
		
		//2nd Approach...............
		String s11=removeWhiteSpace1(s);
		System.out.println(s11);
	}

	

	

}
