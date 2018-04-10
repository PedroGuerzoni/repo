
public class polyContructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Summation ob1 = new Summation(10);
		Summation ob2 = new Summation(ob1);
		ob1.sum = 3;

		System.out.println(ob1.sum + ";;;" + ob2.sum);
		
	}

}

class Summation{
	
	
	int sum;
	
	Summation(int i){
		this.sum = 0;
		for(int a = 0;a<i;a++) this.sum += i;
		
	}
	
	Summation(Summation ob){
		
		this.sum = ob.sum;
		
	}
	

	
}