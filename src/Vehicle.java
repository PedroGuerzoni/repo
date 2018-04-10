
public class Vehicle implements Ivehicle{

	int passengers;
	int fuel;
	int mpg;
	
	Vehicle(int passengers,int fuel,int mpg){
		
		this.passengers = passengers;
		this.fuel = fuel;
		this.mpg = mpg;
		
		
	}
	
	public void range(int x) {
		
		if (x == 1) return;
		System.out.println(fuel*mpg);
	}
	
}
