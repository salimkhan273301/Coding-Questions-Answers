package multithreadingdemo;
class Thread1 extends Thread{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
class Thread2 extends Thread{
	public void run() {
		for(int i=11; i<=20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultithreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1=new Thread1();
		
		t1.start();
		
		
		
		Thread2 t2=new Thread2();
		t2.start();
		
		

	}

}
