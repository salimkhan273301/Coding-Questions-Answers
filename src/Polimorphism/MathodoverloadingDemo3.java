package Polimorphism;

class X{
	
	static void methode() {
		System.out.println("Superclass Methode");
	}
	
}
class B extends X{
	
	static void methode() {
		System.out.println(" child class Methode");
	}
	
}

public class MathodoverloadingDemo3 {
	
	

	public static void main(String[] args) {
		
		X a=new X();
		a.methode();  // Superclass Methode
		X b=new B();
		b.methode();  // Superclass Methode
		
		B b1=new B();
		b1.methode(); //child class Methode
		
		
		//B b2=(B) new X();
		//b2.methode();
		

	}

}
