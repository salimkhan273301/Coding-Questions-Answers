package com.revature.practical;

public class StringOpration {

	public static void main(String[] args) {

		String s="Apple";
		String s1="Bank";
		
		int mid,i,j = 0;
		
		char arr[]=s1.toCharArray();
		if((arr.length)%2==0) {
			 mid=(arr.length)/2;
			 j=arr.length-1;
		}
		else {
		 i=0;
		 j=arr.length-1;
		
		 mid=(i+j)/2;
		}
		System.out.println(mid);
		
		while(mid<=j) {
			char temp=arr[mid];
			arr[mid]=arr[j];
			arr[j]=temp;
			mid++;
			j--;
			
		}
		
		String s2="";
		for(char x:arr) {
			s2+=x;
		}
		
		System.out.println(s2);
	}

}
