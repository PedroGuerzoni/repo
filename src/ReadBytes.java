import java.io.*;
public class ReadBytes {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
		byte[] data;
		data = new byte[10];
		
		System.out.println("Enter data: ");
		System.in.read(data);
		System.out.print("You entered: ");
		for(byte x:data) {
		 System.out.print((char) x);
			
		}
	
		
	}

}
