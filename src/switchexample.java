
public class switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<5;i++) {
			
			switch (i) {
			
			case 0: System.out.println("i is less than 1\n");

			case 1: System.out.println("i is less than 2\n");
			
			case 2: System.out.println("i is less than 3\n");
			
			case 3: System.out.println("i is less than 4\n");
			
			case 4: System.out.println("i is less than 5\n");
			
			}
		}
		
		
		
		
		for(int i = 0;i<10;i++) {
			
			switch (i) {
			
/*			Each value specified in the case statements
 *  must be a unique constant expression (such as a literal value).
 *   Duplicate case values are not allowed.
 *    The type of each value must be compatible with the type of expression.
 *     The default statement sequence is executed if no case constant matches the expression. 
 *     The default is optional; if it is not present, no action takes place if all matches fail.
 *      When a match is found, the statements associated with that case are executed until
 *       the break is encountered or, in the case of default or the last case, 
 *       until the end of the switch is reached.
 *       When encountered within the statement sequence of a case, the break statement 
 *       causes program flow to exit from the entire switch statement and resume at the 
 *       next statement outside the switch. However, if a break statement does not end the
 *        statement sequence associated with a case, then all the statements at and following the matching 
 *       case will be executed until a break (or the end of the switch) is encountered.
 *       
*/			
			case 0: System.out.println("Number is 0");
			break;

			case 1: System.out.println("Number is 1");
			break;
			
			case 2: System.out.println("Number is 2");
			break;
			
			case 3: System.out.println("Number is 3");
			break;
			
			case 4: System.out.println("Number is 4");
			break;
			
			default: System.out.println("Number is equal or greater to 5");
			
			
			
			}
			
			
		}

	}

}
