package Polimorphism;
class Bank{
	int rateofIntrest() {
	return 0;
}
	
}

class SBI extends Bank{
	int rateofIntrest() {
		
		return 20;
	}
}

class Axis extends Bank{
	
	int rateofIntrest() {
		return 10;
	}
}

class PunjabBank extends Bank{
	int rateofIntrest() {
		return 12;
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
	SBI s=new SBI();
	int r=	s.rateofIntrest();
	System.out.println(r);
	System.out.println("=============================");
	Axis a=new Axis();
	System.out.println(a.rateofIntrest());
	System.out.println("=================================");
	PunjabBank p=new PunjabBank();
	System.out.println(p.rateofIntrest());
		

	}

}
