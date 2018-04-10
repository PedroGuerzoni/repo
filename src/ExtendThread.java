
public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//	MyThread mt = new MyThread("Child1");
		
		
		System.out.println("Main thread starting.");
	//	mt.start();
		
		MyThread mt1 = MyThread.createStart("Child1");
		MyThread mt2 = MyThread.createStart("Child1");
		MyThread mt3 = MyThread.createStart("Child1");

		do {
		try {
			
				Thread.sleep(100);

			
		}catch(InterruptedException e) {		System.out.println(" Main thread interrupted.");}

		}while(mt1.isAlive() || mt2.isAlive() || mt3.isAlive());	
		System.out.println("Main thread terminating.");

	}
	

}

class MyThread extends Thread{
	
	MyThread(String name){
		super(name);
		
	}
	public static MyThread createStart(String name) {
		MyThread mt = new MyThread(name);
		mt.start();
		return mt;
		
	}
	public void run() {
		System.out.println(getName() + " starting.");

		try {
			for(int count = 0; count<10;count++) {
				Thread.sleep(1000);
				System.out.println("In " + getName() + ", count is " + count);
			}
			
		}catch(InterruptedException e) {		System.out.println(getName() + " interrupted.");}
		System.out.println(getName() + " terminating.");
		
	}
}