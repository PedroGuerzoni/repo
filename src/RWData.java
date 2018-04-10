import java.io.*;

public class RWData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		double d = 1020.5;
		boolean b = true;
		
	try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("src/testData.txt"))){
			
			dataOut.writeInt(i);
			dataOut.writeDouble(d);
			dataOut.writeBoolean(b);

			
		}catch(IOException e) {
			
			System.out.println(e.toString());
			return;
		}
		
	
	try(DataInputStream dataOut = new DataInputStream(new FileInputStream("src/testData.txt"))){
		
		i = dataOut.readInt();
		d = dataOut.readDouble();
		b = dataOut.readBoolean();

		System.out.println(i);
		System.out.println(d);
		System.out.println(b);

		
	}catch(IOException e) {
		
		System.out.println(e.toString());
		return;
	}
	
	}

}
