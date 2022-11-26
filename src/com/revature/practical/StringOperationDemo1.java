package com.revature.practical;

import java.util.Scanner;

public class StringOperationDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		sc.close();
		String f_half=s.substring(0,s.length()/2);
		String l_half=s.substring(s.length()/2);
		StringBuilder sb=new StringBuilder(l_half);
				String rev=sb.reverse().toString();

				String result=f_half+rev;
				System.out.println(result);
	}

}
