package basicPrograming;

public class IntegerDemo {

	public static void main(String[] args) {
		for(int i=1; i<=200; i++) {
			int x=primeNo(i);
			if(x>0)
			System.out.print(x+" ");
		}
		
		

	}

	private static int primeNo(int i) {
		int count=0;
		for(int j=1; j<=i; j++) {
			if(i%j==0)
				count++;
			
		}
		if(count==2)
			return i;
		
		return 0;
	}

}
