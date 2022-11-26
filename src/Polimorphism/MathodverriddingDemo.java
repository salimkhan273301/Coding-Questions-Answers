package Polimorphism;
class Animal{
	public void sound() {
		System.out.println("overridden Method");
	}
}
public class MathodverriddingDemo extends Animal {

	public void sound() {
		System.out.println("overriding Method");
	}
	public static void main(String[] args) {
		
		MathodverriddingDemo obj=new MathodverriddingDemo();
		obj.sound();
		System.out.println("=====================================");
		Animal obj1=new MathodverriddingDemo();
		obj1.sound();
		System.out.println("=====================================");
	Animal obj3=new Animal();
		obj3.sound();
		System.out.println("=====================================");
		
		
	}

	
}
