import java.io.IOException;

public class Comma {

	public static void main(String[] args) throws IOException {

/*		int i,j;
		
		for(i = 10, j = -10; i>j; i--,j++) {
			
			System.out.println("i and j are: " + i + "\t" + j);
			
		}
		System.out.println("Enter Password:");*/

/*		for(i = 0; (char) System.in.read() != 's';i++) {
			System.out.println("Pass:" + i);
			if(i >= 3) {
				
				System.out.println("3 types wrong!:");
				break;
			}
			
			
		}*/
		
/*		int sum = 0;
		
		for(int i = 1; i<1000; sum += i++);
		
		System.out.println(sum);*/
/*		char ignore;
		char pass;
		do {
			
			System.out.println("Enter the password:");
			pass = (char) System.in.read();
			if(pass == 'k') System.out.println("Right");
			else System.out.println("Try again");
			
			
			do {
				ignore = (char) System.in.read();

				
			}while(ignore != '\n');
		} while(pass != 'k');
			*/
		
		
		
/*		// label: block
		// break label;   -- program goes to the END of block with "label"
		// break label must be enclosed by the block!!!!!!!!!!!!!
		
	sai: 	for(int i = 0;i<2;i++) {
			
			one: {
				two:{
				if (i==0) break one;
				if (i==1) break two;
				
				System.out.println("wont print");

			
			}
			System.out.println("end of block 2");
			break sai;
			
			}
			System.out.println("end of block 1");

			
		}*/
		
		 
	//sai: if(true) System.out.print("not work");  //if sai were here it wouldnt work, break label must be enclosed by the block!!!!!!!!!!!!!
	
		
		
		for(int i = 1;i<100;i++) {
			
			if(i%2 != 0) continue; // this iterates directly
			System.out.println(i + " is even");
			
		}
		
/*		In while and do-while loops, a continue statement
 *  will cause control to go directly to the conditional expression and then continue the
 *   looping process. In the case of the for, the iteration expression of the loop is evaluated,
 *    then the conditional expression is executed, and then the loop continues.
*/	
	}

}
