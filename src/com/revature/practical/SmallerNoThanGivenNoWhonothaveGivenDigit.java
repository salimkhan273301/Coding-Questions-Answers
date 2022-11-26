package com.revature.practical;

import java.util.Scanner;

public class SmallerNoThanGivenNoWhonothaveGivenDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		System.out.println("Enter the Digit:");
		int d=sc.nextInt();
		
		int res=getRes(n,d);
		if(res>-1)
		System.out.println(res);


	}

	private static int getRes(int n, int d) {
		//char c=Integer.toString(d).charAt(0);
		char c=String.valueOf(d).charAt(0);// Integer.toString(d).charAt(0); this also can be used...
		//System.out.println(c);
		for(int i=n; i>0; i--) {
			if(String.valueOf(i).indexOf(c)==-1)// Integer.toString(i).indexOf(c) this also can be Used
				return i;
		}
		return -1;
	}

}
