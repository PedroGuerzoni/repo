import java.io.IOException;

public class Selftestchapter3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
/*		char c;
		main: for(;;) {
			c = (char) System.in.read();
			if (c == '.') break main;
			System.out.print(c);
		}*/

		
/*		for(int i = 1; i<=32;i +=i) {
			
			System.out.println(i);
			
		}*/
		
		
		char ignore;
		char c;
		int counterlow = 0;
		int counterup = 0;
		
		while(true) {
			
			System.out.println("Enter the character:");
			c = (char) System.in.read();
			if (c == '.') break;
			if(c >= 'a') {
				
				System.out.println((char) (c-32));
				counterlow++;
				
			}
			
			
			else {
				
				System.out.println((char) (c+32));
				counterup++;
			}
			
			
			do {
				ignore = (char) System.in.read();

				
			}while(ignore != '\n');
		}
		System.out.println("Low count: " + counterlow + " and upper count: " + counterup);

		
	}

}
