public class overlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overload o = new overload();
		
		o.ovl();
		o.ovl(2);
		int x = o.ovl(2,5);
		double y = o.ovl(2.0,5.0);


		
	}

}

class overload{
	
	void ovl() {
		System.out.println("no parameters");
		
	}
	
	void ovl(int a) {
		System.out.println("1 parameter: " + a);
		
	}
	
	int ovl(int a, int b) {
		System.out.println("2 parameter (return int): " + a +" and " + b);
		return a+b;
	}
	
	double ovl(double a, double b) {
		System.out.println("2 parameter(return double): " + a +" and " + b);
		return a+b;
	}
	
}




