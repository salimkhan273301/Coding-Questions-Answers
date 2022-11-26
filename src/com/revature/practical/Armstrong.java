package com.revature.practical;

public class Armstrong {

	public static void main(String[] args) {
		for(int i=0; i<10000; i++) {
			int x=armstrong(i);
			
			if(x>0)
					System.out.print(x+" ");
		}
	}

	private static int armstrong(int i) {
		int n=i;
		int sum = 0;
		int len=numLenth(i);
		while(i!=0) {
			sum+=Math.pow(i%10, len);
			i/=10;
		}
		if(sum==n)
		  return n;
		else
		return -1;
	}

	private static int numLenth(int i) {
		int l=String.valueOf(i).length();
		return l;
	}

}
