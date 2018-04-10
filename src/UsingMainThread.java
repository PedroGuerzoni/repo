
public class UsingMainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread mainThread = Thread.currentThread();
		mainThread.setName("Main Thread");
		mainThread.setPriority(2);
		
		System.out.println(mainThread.getName());
		System.out.println(mainThread.getPriority());

	}

}
