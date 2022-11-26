package constructordemo;

class Employee{
	
	int id;
	String name;
	double salary;
	
	Employee(){
		id=101;
		name="salim";
		salary=3000.20;
	}
	
	void display() {
		System.out.println("ID : "+ id);
		System.out.println("Name : "+ name);
		System.out.println("Salary : "+ salary);
	}
	
	Employee(int id, String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.display();
		
		Employee e2=new Employee(102,"Nadeem",300234);
		e2.display();

	}

}
