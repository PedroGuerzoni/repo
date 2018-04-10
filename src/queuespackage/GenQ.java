package queuespackage;

public class GenQ<T> implements IGenQ<T> {

	private T q[];
	private int putloc,getloc;
	
	
	public GenQ(T[] aref) {
		q = aref;
		putloc = getloc = 0;
		
	}
	
	@Override
	public void put(T o) throws QueueFullException {
		// TODO Auto-generated method stub
		if(putloc == q.length) throw new QueueFullException(q.length);
		
		q[putloc++] = o;
		
	}

	@Override
	public T get() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(putloc == getloc) {
			throw new QueueEmptyException();
			
			 
		}
		
		return q[getloc++];
	}
	
	
	

}
