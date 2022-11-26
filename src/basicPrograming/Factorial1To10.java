package basicPrograming;

public class Factorial1To10 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			long l=factOfGivenNo(i);
			System.out.print(l+" ");
		}

	}

	private static long factOfGivenNo(int i) {
		if(i==0 || i==1)
			return 1;
		return i*factOfGivenNo(i-1);
	}

}
