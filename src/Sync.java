/*
public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};
		
		MyThread2 mt1 = MyThread2.createStart("Child 1", a);
		MyThread2 mt2 = MyThread2.createStart("Child 2", a);

		try {

			mt1.t.join();
			mt2.t.join();

		}catch(InterruptedException e) {	System.out.println("Main thread interrupted.");}



	}

}


class SumArray{
	private int sum;
	
	synchronized int sumArray(int a[]) {
		sum = 0;

		for(int i = 0; i< a.length;i++) {
			sum += a[i];
			System.out.println("Running total for: " + Thread.currentThread().getName() + " is " + sum);
			try {
				
				Thread.sleep(10);

			
		}catch(InterruptedException e) {	System.out.println("Thread interrupted.");}

		
		}
		
		return sum;
	}
	
}

class MyThread2 implements Runnable{

	Thread t;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	MyThread2(String name,int a[]){
		t = new Thread(this,name);
		this.a = a;
	}
	public static MyThread2 createStart(String name, int a[]) {

		MyThread2 mt = new MyThread2(name,a);
		mt.t.start();

		return mt;
		
	}
	
	public void run() {

		int sum;
		System.out.println(t.getName() + " starting");
		answer = sa.sumArray(a);
		System.out.println("Sum for " + t.getName() + " is " + answer);
		System.out.println(t.getName() + " terminating");

		
	}
	
	
	
}*/




public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};
		
		MyThread2 mt1 = MyThread2.createStart("Child 1", a);
		MyThread2 mt2 = MyThread2.createStart("Child 2", a);

		try {

			mt1.t.join();
			mt2.t.join();

		}catch(InterruptedException e) {	System.out.println("Main thread interrupted.");}



	}

}


class SumArray{
	private int sum;
	
	 int sumArray(int a[]) {
		sum = 0;

		for(int i = 0; i< a.length;i++) {
			sum += a[i];
			System.out.println("Running total for: " + Thread.currentThread().getName() + " is " + sum);
			try {
				
				Thread.sleep(20);

			
		}catch(InterruptedException e) {	System.out.println("Thread interrupted.");}

		
		}
		
		return sum;
	}
	
}

class MyThread2 implements Runnable{

	Thread t;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	MyThread2(String name,int a[]){
		t = new Thread(this,name);
		this.a = a;
	}
	public static MyThread2 createStart(String name, int a[]) {

		MyThread2 mt = new MyThread2(name,a);
		mt.t.start();

		return mt;
		
	}
	
	public void run() {

		int sum;
		System.out.println(t.getName() + " starting");
		synchronized(sa) {
		answer = sa.sumArray(a);
		}
		System.out.println("Sum for " + t.getName() + " is " + answer);
		System.out.println(t.getName() + " terminating");

		
	}
	
	
	
}