
public class BackStringDemo {

	public static void main(String[] args) {

		String x = "Pedro Figueiredo";
		backString(x,0);
		
		int y[] = {1,2,3,4};
		varargs(y);
	}
	
	static void backString(String x, int i) {
		
		if(i != x.length()-1) {
			
			backString(x,i+1);
		}
		
		System.out.print(x.charAt(i));
	}
	
	static void varargs(int ... i) {
		int sum = 0;
		for(int a:i) sum+=a;
		
		System.out.print(sum); 
	}

}
