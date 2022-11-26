package SingeltonPatternDemo;

public class SingeltonDemo1 {
	
	
	private static SingeltonDemo1 obj=null;
	
	private SingeltonDemo1() {
		
	}
	
	public SingeltonDemo1 getObject() {
		if(obj==null) {
			
			obj=new SingeltonDemo1();
		}
		
		
		return obj;
		
	}

}
