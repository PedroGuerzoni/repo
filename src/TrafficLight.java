
public enum TrafficLight {

	GREEN(3),YELLOW(2),RED(5);
	
	private int seconds;
	TrafficLight(int seconds){this.seconds = seconds;}
	
	public int getSeconds() {return seconds;}
	
}

