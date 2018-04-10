
public class LogicalOpTable {

	public static void main(String args[]){
		
		System.out.println("P\tQ\tAND\tOR\tXOR \tNOT");
		boolean p,q;
				
		p = false;
		q = false;
		show(p,q);
		
		q = true;
		p = false;
		show(p,q);
		
		q = false;
		p = true;
		show(p,q);
		
		p = true;
		q = true;
		show(p,q);
		
	}
	
	private static void show(boolean p,boolean q) {
		int and,or,xor,not,p1,q1;
/*		
		p1 = boltonum(p);
		q1 = boltonum(q);
		and = boltonum(p && q);
		or = boltonum(p || q);
		xor = boltonum(p ^ q);
		not = boltonum(!p);*/
		
		p1 = (p)  ? 1:0;
		q1 = (q) ? 1:0;
		and = (p && q)? 1:0;
		or = (p || q)? 1:0;
		xor = (p ^ q)? 1:0;
		not = (!p)? 1:0;
		
		System.out.println(p1 + "\t" + q1 + "\t" + and + "\t" + or + "\t" + xor + "\t" + not );

		
	}
	
/*	private static int boltonum(boolean x) {
		int y = 0;	
		if (x) y = 1;

		return y;
	}*/
}
