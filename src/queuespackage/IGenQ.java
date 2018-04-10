package queuespackage;
public interface IGenQ<T> {
	
	public void put(T o) throws QueueFullException;
	public T get() throws QueueEmptyException;

}
