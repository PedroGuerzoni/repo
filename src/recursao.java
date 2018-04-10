
public class recursao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(3));
		
		
	}

	
	
	 static double factorial(double x) {
		

		if(x>1) {
	     
			return x * factorial(x-1);
			
		}
		
		 return 1;
		
	}
	
}
