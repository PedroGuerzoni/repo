
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Stack<Double> s = new Stack<>(new Double[10]);
		Stack<Integer> s2 = new Stack<>(new Integer[10]);
			try {
					s.push(1.1);
					s.push(2.1);
					s.push(3.2);
					s.push(4.3);
					s.push(5.5);
					
					s2.push(6);
					s2.push(7);
					s2.push(8);
					s2.push(9);
					s2.push(10);
					
					//Stack.swap(s,s2);
					System.out.println(s.pop());
					System.out.println(s.pop());
					System.out.println(s.pop());
					System.out.println(s.pop());
					System.out.println(s.pop());
					System.out.println(s.pop());
					System.out.println(s.pop());
			
			}catch(pushException | popException e) {
				System.out.println(e.toString());
			}




	}

}


class Stack<T>{
	
	private T[] ch;
	private int index;
	private int size;
	
	Stack(T[] ob){
		
		this.size  = ob.length;
		this.ch =  ob;
		this.index = 0;
		
		
	}
	
	
	static <V> void swap(Stack<V> st1,Stack<V> st2){
		if(st1.size == st2.size) {
			
		int in = st1.index;
		st1.index = st2.index;
		st2.index = in;
		
		
		V c;
		
		for(int i = 0; i<st1.size;i++) {
			c = st1.ch[i];
			st1.ch[i] = st2.ch[i];
			st2.ch[i] = c;
			
		}

		
		}
		else System.out.println("Different sizes! Cannot swap");
	}
	
	void push(T x) throws pushException{
		
		if(index < ch.length) 
			ch[index++] = x;
			
		else throw new pushException();
		
		
	}
	
	T pop() throws popException{
		index--;
		if(index >= 0) 
			return ch[index];
			
		else {
			index = 0;
			throw new popException();
			
		}
		
		
	}
	
	
}


class pushException extends Exception{
	@Override
	public String toString() {return "Stack is full!";}
	
}
class popException extends Exception{
	@Override
	public String toString() {return "Stack is Empty!";}
	
}
