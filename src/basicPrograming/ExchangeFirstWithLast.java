package basicPrograming;

public class ExchangeFirstWithLast {

	public static void main(String[] args) {
		String s="salim";
		/*
		 * char arr[]=s.toCharArray(); int i=0; int j=arr.length-1; while(i<=j) { char
		 * temp=arr[i]; arr[i]=arr[j]; arr[j]=temp; i++; j--; break; }
		 * 
		 * String s1=new String(arr); System.out.println(s1);
		 */
		
		String s1=exchangeChar(s);
		System.out.println(s1);

	}

	private static String exchangeChar(String s) {
		if(s.length()==1)
			return s;
		
		return s.substring(s.length()-1)+s.substring(1,s.length()-1)+s.charAt(0);
	}

}
