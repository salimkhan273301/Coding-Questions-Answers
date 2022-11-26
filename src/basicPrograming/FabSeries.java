package basicPrograming;

import java.util.Scanner;

public class FabSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter till you want to print the series");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
		int x=fabDemo(i);
			
			if(x<=n) 
				System.out.print(x+" ");
			else
				break;
			
		}

	}

	private static int fabDemo(int i) {
		if(i<=1)
		return i;
		else
			return fabDemo(i-1)+fabDemo(i-2);
	}

}
