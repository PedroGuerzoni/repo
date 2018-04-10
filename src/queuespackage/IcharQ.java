package queuespackage;

public interface IcharQ {

	void put(char c) throws QueueFullException;
	char get() throws QueueEmptyException;
	default void reset() {
		return;
	}
	static void copy(IcharQ q1, IcharQ q2) {
		try {
			q1.put(q2.get());
		} catch (QueueFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
