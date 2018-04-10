public class TruckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck t1 = new Truck(5,4,3,10);
		Vehicle2 v1;
		v1 = t1;
		
		
		
	}

}



class Vehicle2 {

	private int passengers;
	private int fuel;
	private int mpg;
	
	Vehicle2(int passengers,int fuel,int mpg){
		
		this.passengers = passengers;
		this.fuel = fuel;
		this.mpg = mpg;
		
		
	}
	public Vehicle2(Truck ob) {
		passengers  = ob.getpassengers();
		fuel = ob.getfuel();
		mpg = ob.getmpg();
	}
	int getpassengers() {return passengers;}
	int getfuel() {return fuel;}
	int getmpg() {return mpg;}
	void setpassengers(int passengers) {this.passengers = passengers;}
	void setfuel(int fuel) {this.fuel = fuel;}
	void setmpg(int mpg) {this.mpg = mpg;}
	
	void range(int x) {
		
		if (x == 1) return;
		System.out.println(fuel*mpg);
	}
	
}

class Truck extends Vehicle2{
	private int cargocap;
	
	Truck(int passengers, int fuel, int mpg, int cargocap) {
		super(passengers, fuel, mpg);
		this.cargocap = cargocap;
	
	}
	Truck(Truck ob){
		super(ob);
		this.cargocap = ob.cargocap;
		
	}

	int getcargocap() {return cargocap;}
	void setcargocap(int cargocap) {this.cargocap = cargocap;}
	
}



















