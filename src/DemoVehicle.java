
public class DemoVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car1;
		car1 = new Vehicle(1,2,3);
		Vehicle car2 = car1;
		Vehicle v = new truck1(1,2,3);
		Vehicle v1 = new car(1,2,3);

		
		if(v instanceof truck1) System.out.println("yes");
		if(v1 instanceof truck1) System.out.println("yes");

		
		System.out.println(car1.fuel);
		System.out.println(car2.mpg);
		
		car2.range(0);

	}

}

class truck1 extends Vehicle{

	int i;
	String brand;
	truck1(int passengers, int fuel, int mpg) {
		super(passengers, fuel, mpg);
		// TODO Auto-generated constructor stub
	}
	
	
}

class car extends Vehicle{

	int i;
	String brand;
	car(int passengers, int fuel, int mpg) {
		super(passengers, fuel, mpg);
		// TODO Auto-generated constructor stub
	}
	
	
}
