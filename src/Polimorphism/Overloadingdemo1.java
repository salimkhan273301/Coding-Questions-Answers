package Polimorphism;

interface Add{
	int sum(int a,int b);
}

class Addition implements Add{
	
	

	@Override
	public int sum(int a,int b) {
		
		return a+b;
	}
}
class Addition1 implements Add {
	
@Override
public	int sum(int a,int b) {
		return a+b;
	}
}
public class Overloadingdemo1 {

	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println(a.sum(10, 20));
		System.out.println("=======================");
		Addition1 a1=new Addition1();
		System.out.println(a1.sum(10, 60));
		
	}

}
