import java.io.*;

public class ThrowsDemo {
	
	public static char prompt(String str) throws IOException{
		
		System.out.println(str + ": ");
		
		return (char) System.in.read();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		
		try {
			ch = prompt("Enter a letter");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception error");

		}
		System.out.println("Exception passed");

		
	}

}


