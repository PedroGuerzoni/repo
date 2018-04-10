
public class findprimenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 2; i < 100; i++) {
			
			boolean prime = true;
			for(int j = 2; j<= i/2; j++) {
				
				if (i%j == 0) prime = false;
				
				
			}
			
			if(prime) System.out.println(i);
		}
		
	}

}
