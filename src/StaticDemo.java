
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		staticexample st1 = new staticexample();
		staticexample st2 = new staticexample();
		if(st1 instanceof staticexample) System.out.println("yes");

		st1.x = 2;
		st2.x = 4;
		
		staticexample.y = 1;
		
		System.out.println(st1.sum());
		
		System.out.println(st2.sum());

		staticexample.y = 2;
		
		System.out.println(st1.sum());
		
		System.out.println(st2.sum());
		
		System.out.println(staticexample.div(10,2));


	}

}

class staticexample{
	
	
	int x;
	static int y;
	
	static {
		
		y = 0;
	}
	
	int sum() {
		
		return x + y;
		
	}
	
	static int div(int a,int b) {
		
		return a/b;
	}
	
}