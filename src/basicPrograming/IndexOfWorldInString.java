package basicPrograming;

import java.util.Scanner;

public class IndexOfWorldInString {
// count khan occurance in string....
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="Salim khan nadeem khan hasan khan rehan khan";
		System.out.println("Enter the String that index you want to count:");
		String s1=sc.nextLine();
		int i=0;
		int count=0;
		int length=s1.length();
		while(i!=-1) {
		i=s.indexOf(s1, i);
		if(i>0)
		System.out.println("Index :"+i);
		
		if(i!=-1) {
			count++;
			i=length+i;
		}
		
		}
		System.out.println("Total Occurance:"+count);

	}

}
