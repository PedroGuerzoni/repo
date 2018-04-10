enum TOOLS{
	
	SCREWDRIVER(1),WRENCH(3),HAMMER(5),PLIERS(7);
	
	private int weight;
	TOOLS(int weight){
		 this.weight = weight;
		}
	
	int getWeight(){return weight;}
	
}
public class ToolsExample {

	
	public static void main (String args[]) {
		
		

		for(TOOLS x:TOOLS.values()) {
			System.out.println(x + ": " + x.ordinal() + " Weight: " + x.getWeight());
			
		}
	}
}
