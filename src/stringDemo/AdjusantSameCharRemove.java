package stringDemo;

import java.util.Scanner;

public class AdjusantSameCharRemove {

	public static void main(String[] args) {
		//String s="google";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		
	String s1=	adjusantDeletion(s);
		System.out.println(s1);

	}

	private static String adjusantDeletion(String s) {
		
		while(s.length()>0) {
		int i=ckeckAdjusant(s);
		if(i==-1) {
			break;}
		else
			s=s.substring(0,i)+s.substring(i+2);
		}
		return s;
	}

	private static int ckeckAdjusant(String s) {
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1))
				return i;
		}
		return -1;
	}

}
