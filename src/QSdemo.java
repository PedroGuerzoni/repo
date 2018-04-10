
public class QSdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c[] = {'g','h','t','w','c','x','s','a','q','u','j','i','m','n','h','z','u','t','f','r'};
		int list[] = new int[50];
		
		for(int i = 0; i < list.length;i++) {
			list[i] = (int)( Math.random() * 50 +1); 
			
		}
		
		Quicksort.qsort(c); // passing the reference of c!! that means c will actually be altered
		System.out.println(c);
		
		Quicksort.qsort(list);
		
		for(int i = 0; i < list.length;i++) {
			System.out.println(list[i]);
		}
		
	}

}

class Quicksort{
	
	static void qsort(char items[]) {
		
		qs(items,0,items.length-1);
	}
	
	
	private static void qs(char[] items, int l, int r) {
		
		int i,j;
		char x,y;
		
		i  = l;
		j = r;
		x = items[(l+r)/2];
		
		do {
			
			while((items[i] < x) && (i<r)) i++;
			while((items[j] > x) && (j>l)) j--;

			if(i<=j) {
				
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;j--;
				
			}
			
		}while(i<=j);
		
		if(l<j) qs(items,l,j);
		if(i<r) qs(items,i,r);
	}
	
   static void qsort(int items[]) {
		
		qs(items,0,items.length-1);
	}
	
	
	private static void qs(int items[], int l, int r) {
		
		int i,j;
		int x,y;
		int sum = 0;
		i  = l;
		j = r;
		for(int a:items) sum += a;
		
		int av = sum/items.length;
		for(int a = 0;a<items.length;a++) {
			if(items[a] == av) {
				x =  items[a];
				break;
			}
			
		}
		
		
		x = items[(l+r)/2];
		
		do {
			
			while((items[i] < x) && (i<r)) i++;
			while((items[j] > x) && (j>l)) j--;

			if(i<=j) {
				
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;j--;
				
			}
			
		}while(i<=j);
		
		if(l<j) qs(items,l,j);
		if(i<r) qs(items,i,r);
	}
	

	
	
}