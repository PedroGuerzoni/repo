import java.io.*;
public class CopyFile {

		// TODO Auto-generated method stub
		
		public static void main(String[] args){
			// TODO Auto-generated method stub
			int i;

			
			try (FileInputStream fin = new FileInputStream("src/todolist.rtf");
					FileOutputStream fout = new FileOutputStream("src/todolist.txt")){			

				do {
					i=fin.read();
					if(i!=-1) {
						if(i == ' ') fout.write('-');
						else fout.write(i);
						
					}
				}while(i!=-1);
				
			}catch(FileNotFoundException e) {
				System.out.println("File not found");
				return;		
			}catch(IOException e) {
				System.out.println("Error reading file");

			}
		}


	

}
