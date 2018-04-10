/*import java.io.*;
public class ShowFile {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin = null;
		
		try {
			
			fin = new FileInputStream("src/todolist.rtf");
			do {
				i=fin.read();
				if(i!=-1) System.out.print((char) i);
			}while(i!=-1);
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			return;		
		}catch(IOException e) {
			System.out.println("Error reading file");

		}finally {
		
			try {
				if(fin!=null) fin.close();
			}catch(IOException e) {
				System.out.println("Error closing file");
	
			}
		}
	}

}
*/

import java.io.*;
public class ShowFile {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int i;
		
		try (FileInputStream fin = new FileInputStream("src/todolist.txt")){
			
			do {
				i=fin.read();
				if(i!=-1) System.out.print((char) i);
			}while(i!=-1);
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			return;		
		}catch(IOException e) {
			System.out.println("Error reading file");

		}
	}

}
