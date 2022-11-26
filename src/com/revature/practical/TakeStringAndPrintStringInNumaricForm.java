package com.revature.practical;

import java.util.Scanner;

/*Take a string and print characters in numbers 
according to alphabet order like
example abc=123 and then sum of it
(Ex: i/p: vijay, o/p:  67)
*/

public class TakeStringAndPrintStringInNumaricForm {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		changeInt(s);
		

	}

	private static void changeInt(String s) {
		char[] arr=s.toCharArray();
		String sum=""; // if i use int sum=0; than vijayoutput will be 67...
		int r = 0;
		for(char x:arr) {
			sum+=(int)x-96;
			r+=(int)x-96;
		}
		System.out.println(sum);
		System.out.println("========================");
		System.out.println(r);
	}

}
