
public class foreachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle[] num = new Vehicle[10];
		int[] a = new int[10]; 
	
		for(int i = 0;i<10;i++) {
			
			num[i] = new Vehicle(i,i,i);
			a[i] = i;

			
		}
	
		for(Vehicle x:num) {
			
			System.out.println(x.fuel + "" + x.mpg + "" + x.passengers);
			
		}

		for(int x:a) {
			
			System.out.println((int) Math.pow(x, 2));
			
		}

	}

}
