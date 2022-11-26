package basicPrograming;

public class IfDemo {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		if(a==10)
			b--;
		System.out.println(a+","+b--);
		
		int i,sum=0;
		for( i=7; i>=5; --i)
		{
			System.out.println(i);
			sum=sum+i;
			i=i-1;
			//System.out.println("================================");
			System.out.println(i);
		
		}
		System.out.println("-------------------------------");
		System.out.println("sum = "+sum);
System.out.println(i);
	}

}
