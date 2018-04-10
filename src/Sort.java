
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] = new int[50];
		
		for(int i = 0; i < list.length;i++) {
			list[i] = (int)( Math.random() * 50 +1); 

			
		}
		
		
		boolean c = true;
	do {
		
		c = true;
		for(int i = 0; i < list.length -1;i++) {
			
			int a = list[i];
			int b = list[i+1];
			if(a > b) {
				list[i] = b;
				list[i+1] = a;
				c = false;
			}
		

		}

	}while(!c);

	for(int i = 0; i < list.length;i++) {
		System.out.println(list[i]); 

		
		}
}	
	
}
