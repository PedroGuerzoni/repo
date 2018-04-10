import java.util.Scanner;

public class ratioof {

	public static void main(String[] args) {
		
		double x,y,z;
	    x =  y = z = 100;
	    x += 10;
		System.out.println("Enter the numerator: ");
		
		Scanner n = new Scanner(System.in);	//read in stream in object s (scanner)
		double numerator = n.nextDouble(); // save content in "in" 
		
		System.out.println("Enter the denominator: ");
		
		Scanner d = new Scanner(System.in);	//read in stream in object s (scanner)
		double denominator = d.nextDouble(); // save content in "in" 


		
		if (denominator != 0 && numerator%denominator == 0 )
			System.out.println("No rest" );
		


	}
}
