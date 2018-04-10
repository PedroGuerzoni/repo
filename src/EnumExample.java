
public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transport tp;
		
		tp = Transport.TRAIN;
		tp = Transport.valueOf("TRAIN");
		System.out.println(tp);
		int x = Transport.BOAT.getSpeed();
		
		Transport alltransports[] = Transport.values();
		
		for(Transport t: alltransports)
			System.out.println(t.getSpeed());
		System.out.println(Transport.AIRPLANE.ordinal());
		
		if(tp.compareTo(Transport.BOAT) > 0) System.out.print(tp + " comes after boat");

	}

}
