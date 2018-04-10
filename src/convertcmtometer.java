
public class convertcmtometer {
	
	public static void main(String[] args) {
		
		int counter = 0;
		
		for(double cm = 0; cm <= 100; cm = cm +1) {
			
			System.out.println(cm + " cm = " + cm/100 + "m");
			

			if(counter == 10){
				
				System.out.println();
				counter = 0;
			}
			
			counter++;
		}
		

		
		
	}

}
