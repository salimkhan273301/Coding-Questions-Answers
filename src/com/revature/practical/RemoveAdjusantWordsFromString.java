package com.revature.practical;

public class RemoveAdjusantWordsFromString {

	public static void main(String[] args) {
		
		String s="googleoollmmaasalim";
	    removeWordes(s);
		

	}

	private static void removeWordes(String s) {
		
		while(s.length()>0) {
			
			int i=isSameCharacter(s);
			if(i==-1) break;
			s=s.substring(0,i)+s.substring(i+2);
		}
		System.out.println(s);
	}

	private static int isSameCharacter(String s) {
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1))
				return i;
		}
		return -1;
	}

}
