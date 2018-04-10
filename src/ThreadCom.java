
public class ThreadCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TickTock tt = new TickTock();
		MyThread3 mt1 = MyThread3.createStart("Tick", tt);
		MyThread3 mt2 = MyThread3.createStart("Tock", tt);

		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
			
		}catch(InterruptedException e) {
			
			System.out.println("Thread interrupted");

		}
	}

}


class TickTock{
	
	String state;
	
	synchronized void Tick(boolean running,int sec){
		
		if(!running) {
		state = "ticked";
		notify();
		return;
		}
		
		System.out.print("Tick ");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		state = "ticked";
		notify();
		
		try {
			while(!state.equals("tocked")) {
				wait();
				
			}
			
		}catch(InterruptedException e) {
			
			System.out.println("Thread interrupted");

		}

		
		
	}
	
	
	
	synchronized void Tock(boolean running, int sec){
		
		sec++;
		if(!running) {
		state = "tocked";
		notify();
		return;
		}
		
		System.out.println("Tock: " + sec + " seconds" );
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		state = "tocked";
		notify();
		try {
			while(!state.equals("ticked")) {
				wait();
				
			}
			
		}catch(InterruptedException e) {
			
			System.out.println("Thread interrupted");

		}
		
		
	}
	
}


class MyThread3 implements Runnable{

	
	Thread thrd;
	String name;
	TickTock ttobj;
	
	MyThread3(String name, TickTock tt){
		thrd = new Thread(this,name);
		ttobj = tt;
	}
	
	public static MyThread3 createStart(String name, TickTock tt) {
		MyThread3 mt = new MyThread3(name,tt);
		mt.thrd.start();
		return mt;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		
		if(thrd.getName().compareTo("Tick") == 0) {
			
			for (int i = 0; i<5;i++) ttobj.Tick(true,i);
				ttobj.Tick(false,0);
			
		}
		else {
			
			for (int i = 0; i<5;i++) ttobj.Tock(true,i);
				ttobj.Tock(false,0);
			
		}
		
	}
	
}