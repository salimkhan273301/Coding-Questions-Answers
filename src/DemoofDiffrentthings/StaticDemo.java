package DemoofDiffrentthings;

public class StaticDemo {
	
	public static int x;
	public int y;
	
	static{
		x=10;
		//y=20; can not initialize...
	}
	
	{
		y=20;
	}
	
	public void show() {
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void see() {
		//System.out.println(y);// not accessable in static mathod..
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		
		StaticDemo obj=new StaticDemo();
		obj.show();
		see();
	}

}
