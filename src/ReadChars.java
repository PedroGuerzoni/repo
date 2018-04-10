import java.io.*;

public class ReadChars {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		char c;
		String str;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new FileReader("src/todolist.txt"));

		
	do {
			
			c = (char) br2.read();
			System.out.print(c);
			
		}while(c != '.');
		
/*		do {
			
			str =  br.readLine();
			System.out.println(str);
			
		}while(!str.equals("stop"));*/
	}

}
