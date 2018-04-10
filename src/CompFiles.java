import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CompFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try (FileInputStream fin1 = new FileInputStream("src/todolist.txt");
				FileInputStream fin2 = new FileInputStream("src/todolist.txt")){			

			int i;
			int j;
			do {
				i = fin1.read();
			    j = fin2.read();
			    if(i != j || (i == -1 ^ j ==-1)) break;
			    
			    
			}while(i!=-1 && j!=-1);
			
			if(i==j) System.out.println("Files are equal");
			else System.out.println("Files are not equal");
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			return;		
		}catch(IOException e) {
			System.out.println("Error reading file");

		}
	
	}

}
