package Polimorphism;

class A{
	String name="akash";
	void eat() {
		System.out.println("Animal is Eating ");
	}
}
class Dog extends A{
	String name="Salim";
	void eat() {
		System.out.println("Dog is Eating");
	}
	void display() {
		System.out.println(name);// base class var
		System.out.println(super.name);// superclass var 
		super.eat();
	}
}

public class OverloadingDemo2 {

public static void main(String[] args) {
		
Dog obj=new Dog();
obj.eat();
obj.display();
	}

}
