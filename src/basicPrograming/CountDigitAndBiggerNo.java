package basicPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class CountDigitAndBiggerNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No:");
		int n=sc.nextInt();
		int no_Of_Digit=countDigit(n);
		System.out.println("No Of Digit : "+no_Of_Digit);
		int g_digit=greaterDigit(n);
		System.out.println("Greater_No :  "+g_digit);

	}

	private static int greaterDigit(int n) {
		int g=0,r;
		while(n!=0) {
			r=n%10;
			n/=10;
			if(r>g)
				g=r;
			
		}
		return g;
	}

	private static int countDigit(int n) {
		int l=String.valueOf(n).length();
		return l;
	}

}
