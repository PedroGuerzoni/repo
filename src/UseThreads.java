/*
public class UseThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread newThread = new Thread(new myThread("Child 1"));
		Thread newThread2 = new Thread(new myThread("Child 2"));

		
		newThread.start();
		newThread2.start();
		System.out.println("Main thread starting.");

		try {
			
				Thread.sleep(11*1000);

			
		}catch(InterruptedException e) {		System.out.println(" Main thread interrupted.");}
		System.out.println("Main thread terminating.");

		
	}

}

class myThread implements Runnable{

	String thrname;	
	myThread(String name){ thrname = name;}

	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(thrname + " starting.");
		
		try {
			for(int count = 0; count<10;count++) {
				Thread.sleep(1000);
				System.out.println("In " + thrname + ", count is " + count);
			}
			
		}catch(InterruptedException e) {		System.out.println(thrname + " interrupted.");}
		System.out.println(thrname + " terminating.");

	}
	
	
	
}
*/


public class UseThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		myThread1 mt = myThread1.createStart("Child1");
		
		
		System.out.println("Main thread starting.");

		try {
			
				Thread.sleep(11*1000);

			
		}catch(InterruptedException e) {		System.out.println(" Main thread interrupted.");}
		System.out.println("Main thread terminating.");

		
	}

}

class myThread1 implements Runnable{


	Thread tr;
	myThread1(String name){ 
		tr = new Thread(this,name);
		}
	
	public static myThread1 createStart(String name) {
		myThread1 mt = new myThread1(name);
		
		mt.tr.start();
		
		
		return mt;
		
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(tr.getName() + " starting.");
		
		try {
			for(int count = 0; count<10;count++) {
				Thread.sleep(1000);
				System.out.println("In " + tr.getName() + ", count is " + count);
			}
			
		}catch(InterruptedException e) {		System.out.println(tr.getName() + " interrupted.");}
		System.out.println(tr.getName() + " terminating.");

	}
	
	
	
}
