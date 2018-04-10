import java.util.Scanner;
public class weight {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your weight on earth and find out your weight on the moon: ");
		
		Scanner s = new Scanner(System.in);	//read in stream in object s (scanner)
		double in = s.nextDouble(); // save content in "in" 
		
		
		
		System.out.println("weight on the moon: " + in * 0.17);
		
	}

}
