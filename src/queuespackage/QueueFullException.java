package queuespackage;

public class QueueFullException extends Exception {

	int size;
	
	public QueueFullException(int s){ size = s;}
	
	@Override
	public String toString() {return "Queue is full. Max. size is: " + size;}
	
}
