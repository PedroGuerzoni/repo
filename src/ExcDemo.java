/*public class ExcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		int[] dem = {1,0,3,0,5};

		

					
					
				try {	
						System.out.println("try bloc");
						throw new ArithmeticException();
					}

				catch(ArithmeticException exc) {
					
					//System.out.println(exc.toString());
					exc.printStackTrace();


				}
				
				System.out.println("after try bloc");
			
		

		
	}

}*/






/*public class ExcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		int[] dem = {1,7,3,2,5};

		
		try {
				for(int i = 0; i<arr.length; i++) {
						
	
						System.out.println(arr[i]/dem[i]);

				
			}
			
		
		}
		catch(Throwable exc) {
			
			System.out.println("Out of bound or divided by 0");
			return;

		}
		finally {
			System.out.println("Finally block");

		}

	}

}*/



public class ExcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		int[] dem = {6,0,3,0,9};

		

				for(int i = 0; i<arr.length +2; i++) {
					
					
				try {	
					if((arr[i]%dem[i]) != 0) {
						throw new NonInt(arr[i],dem[i]);
						
					}
						System.out.println(arr[i]/dem[i]);
						
					}
/*				catch(ArithmeticException exc) {
					System.out.println("Cannot devide by zero");
				}
				catch(ArrayIndexOutOfBoundsException exc) {
					
					System.out.println("Out of bound");

				}*/
				catch(ArithmeticException | ArrayIndexOutOfBoundsException exc) {
					System.out.println(exc.toString());
				}
				catch(NonInt e) {
					System.out.println(e.toString());

					
				}
			

			}
			
		

		
	}

}

/*
public class ExcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		int[] dem = {1,0,3,0,5};

		
		try {
				for(int i = 0; i<arr.length +2; i++) {
					
					
				try {	
						System.out.println(arr[i]/dem[i]);
						
					}
				catch(ArithmeticException exc) {
					System.out.println("Cannot devide by zero");
				}

			}
			
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			
			System.out.println("Out of bound");

		}
		
	}

}*/





class NonInt extends Exception{
	int i;
	int j;
	
	NonInt(int i, int j){
		
		this.i = i;
		this.j = j;
	}
	
	public String toString() {
		return "Result of " + i + "/" + j + " is non integer";
		
	}
	
	
}
