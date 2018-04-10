
public class TrafficLightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TrafficLightThread mt = TrafficLightThread.createAndStart("Light 1",TrafficLight.RED);
		TrafficLightThread mt2 = TrafficLightThread.createAndStart("Light 2",TrafficLight.GREEN);

		Clock c = Clock.createAndStart();

		for(int i = 0;i<10;i++) {
			
			System.out.println(mt.thrd.getName() + ": " +  mt.getColor() + " / time: " + c.getTime() + " seconds");
			System.out.println(mt2.thrd.getName() + ": " +  mt2.getColor() + " / time: " + c.getTime() + " seconds");

			mt.waitForChange();
			mt2.waitForChange();

		}
		
	}

}



class Clock implements Runnable{
	
	private int seconds;
	Thread thrd;
	
	Clock(){
		thrd = new Thread(this);
		seconds = 1;
		
	}
	


	public int getTime() {
		// TODO Auto-generated method stub
		return seconds;
	}



	public static Clock createAndStart(){
		
		Clock c = new Clock();
		c.thrd.start();
		return c;
			
		
	}



	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				seconds++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class TrafficLightThread implements Runnable{

	Thread thrd;
	TrafficLight tl;
	private boolean changed;
	private boolean stop;
	
	TrafficLightThread(String name,TrafficLight initial){
		thrd = new Thread(this,name);
		tl = initial;
		changed = false;
		stop = false;
		
	}
	


	public static TrafficLightThread createAndStart(String name, TrafficLight initial){
		
		TrafficLightThread tlt = new TrafficLightThread(name,initial);
		tlt.thrd.start();
		return tlt;
		
		
		
	}	
	
	public TrafficLight getColor() {
		
		return tl;
	}
	
	synchronized void waitForChange() {
		
		try {
			while(!changed) 
			wait();

		changed = false;
		}catch(InterruptedException e) {System.out.println("Thread interrupted");}
		
		
		
	}
	
	synchronized void changedColor() {
		
		switch(tl) {
			case GREEN:
				tl = TrafficLight.YELLOW;
				break;
			case RED:
				tl = TrafficLight.GREEN;
				break;
			case YELLOW:
				tl = TrafficLight.RED;
				break;					
	
		}
		changed = true;
		notify();
		
		
	}
	
	public void run() {

		try {
			while(!stop) {
			Thread.sleep(tl.getSeconds() * 1000);
			changedColor();
				
		}
		
		}catch(InterruptedException e) {System.out.println("Thread interrupted");}
		
	}
	
	
	
	
}