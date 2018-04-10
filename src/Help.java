import java.io.IOException;

public class Help {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Help on:\n1. if\n2. switch\nChoose: ");
		char c = (char) System.in.read();
		
		switch(c) {
		
		case('1'): System.out.println("If is very obvious");
		break;
		case('2'): System.out.println("Switch is very obvious");
		default: System.out.println("1 or 2 only!");

		
		}
		
	}

}
