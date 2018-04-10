import javax.swing.JOptionPane;

public class Firstclass {


	private static int sub(int a,int b) {
		int c = 0;
		if (a >= b) 
			c = a-b;
		else
		c = b - a;
		
		return c;
		
		
	}
	
	public static void counter(int a) {
		
		for(int i = 1; i < a; i++) 
		
		System.out.println(i);

		
	}
	
}
