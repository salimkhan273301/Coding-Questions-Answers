package basicPrograming;

class Animal{
	
	public void sound() {
		System.out.println("overridden mathod");
	}
	
	
}
class Dog extends Animal{
	public void sound() {
		System.out.println("overridding Mathod ");
	}
	
}

public class MathodoverrideinDemo {

	public static void main(String[] args) {
		
		Dog obj1=new Dog();
		obj1.sound();
		System.out.println("======================");
		Animal obj=new Dog();
		obj.sound();
		System.out.println("======================");
		Animal obj2=new Animal();
		
		obj.sound();
		

	}

}
