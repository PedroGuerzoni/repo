package mypackage2;

public class SeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byTwo b = new byTwo(0,0);
		System.out.println(b.getNext());
		
		Series b1 = new byTwo(0,0);
		b1.setStart(5);

		b.setStart(5);
		System.out.println(b.start);
		System.out.println(b.val);
	}

}

class byTwo implements Series{

	int start;
	int val;
	int prev;
	
	byTwo(int start,int val){
		this.start = start;
		this.val = val;
		this.prev = start - 2;

	}
	
	public int getNext() {
		val += 2;
		return val;
	}


	public void reset() {
		val = start;
		
	}


	public void setStart(int x) {
		start = val = x;
		prev = x - 2;
		
	}
	
	public int getPrevious() {
		prev -= 2;
		return prev;
		
	}
	
	
	
}