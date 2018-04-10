

import queuespackage.*;

public class IQdemo {

	public static void main(String[] args) {

		IcharQ iQ1;
		IcharQ iQ2;
		IcharQ iQ3;

		
		iQ1 = new FixedQueue(5);
		iQ2 = new CircularQueue(5);
		iQ3 = new DynQueue(5);
		
		try {
			iQ1.put('a');
			// TODO Auto-generated catch block
	
		iQ2.put('b');
		IcharQ.copy(iQ1, iQ2);

		System.out.println(iQ1.get());
		System.out.println(iQ1.get());
			
		} catch (QueueFullException | QueueEmptyException e) {

			System.out.println(e.toString());

		}
	}
}


class FixedQueue implements IcharQ{

	private char q[];
	private int putloc;
	private int getloc;
	
	FixedQueue(int size){
		q = new char[size];
		putloc = getloc = 0;
		
	}
	
	public void put(char c) throws QueueFullException {
			if(putloc == q.length) 
				throw new QueueFullException(q.length);

			q[putloc++] = c;
	}

	public char get() throws QueueEmptyException{
		if(getloc == putloc) 
			throw new QueueEmptyException();

		return q[getloc++];
		
	}

	public void reset() {
		char t[] = new char[q.length];
		q = t;
	}
	
	
	
}




class CircularQueue implements IcharQ{
	private char q[];
	private int putloc;
	private int getloc;
	
	CircularQueue(int size){
		q = new char[size+1];
		putloc = getloc = 0;
		
	}
	public void put(char c) {
		if((putloc == q.length-1 && getloc == 0) || (putloc == getloc-1) ) {
			System.out.println("Out of range");
			return;
		}
		q[putloc++] = c;
		if(putloc == q.length) putloc = 0;

		
	}

	public char get() {

		if(getloc == putloc) {
			
			System.out.println("Empty");
		return (char) 0;
	}
		char ch = q[getloc++];
		if(getloc == q.length) getloc = 0;
		return ch;

	}
	
	public void reset() {
		char t[] = new char[q.length];
		q = t;
	}


}


class DynQueue implements IcharQ {
	private char q[];
	private int putloc;
	private int getloc;
	
	DynQueue(int size){
		q = new char[size+1];
		putloc = getloc = 0;
		
	}
	public void put(char c) {
		if(putloc == q.length) {
			
			char t[] = new char[q.length * 2];
			
			for(int i = 0; i<q.length;i++) t[i] = q[i];

			q = t;
		}
		
		q[putloc++] = c;
		
	}

	public char get() {
		if(getloc == putloc) {
			System.out.println("Empty");
			return (char) 0;
		}

		return q[getloc++];
		
	}
	
	public void reset() {
		char t[] = new char[q.length];
		q = t;
	}
	
	
}





