package staticDemo;





public class StaticDemo1 {
	
	int instance_variable;
	static int static_variable;
	
	
	void instanceMethod()
	  {
	    instance_variable = 10;
	    static_variable = 20;
	  }
	 static void staticMethod()
	  {
	    static_variable = 30;
	  }
	  void display()
	  {
	    System.out.println("instance variable:"+instance_variable);
	    System.out.println("static variable:"+static_variable);
	  }

	public static void main(String[] args) {
		
		  StaticDemo1 sd1 = new StaticDemo1(); sd1.instanceMethod(); sd1.display();
		 
	    
	    
	    StaticDemo1 sd2 = new StaticDemo1();
	    sd2.instanceMethod();
	    sd2.staticMethod();
	    sd2.display();
	    sd1.display();
	   
	    
	    StaticDemo1.staticMethod();
	    sd1.display();
	    sd2.display();
	   
		
		

	}

}
