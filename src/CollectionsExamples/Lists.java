package CollectionsExamples;
import java.util.*;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lallala
		//uehauiheaiu
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
		
		//test1
		
		///lalala  hahaha EHIUAEHiuae pedro

		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"D");
		System.out.println(hm.containsKey(3));
		
		System.out.println(hm.get(1));
		
		for(Map.Entry<Integer, String> a : hm.entrySet()) {
			a.setValue("lol");

			System.out.println(a.getKey() + " " + a.getValue());
			
			
		}
		Set<Map.Entry<Integer, String>> set = hm.entrySet();
		
		
		
		for(Map.Entry<Integer, String> me : set) {

			System.out.println(me.getKey() + " " + me.getValue());

			
		}

//creating conflict //criando conflito 
		
		
		//mais um conflito

		
		
		//conflict again

/*		
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		HashSet<String> hs = new HashSet<String>();
		
		
		hs.add("A");
		hs.add("B");
		hs.add("C");
		Iterator<String> itr = hs.iterator();
		
		
		
		System.out.println(hs.contains("C"));

		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println(al.indexOf("C"));

		String str[] = new String[al.size()];
		str = al.toArray(str);
		
		Collections.reverse(al);
 //lalala
		
		for(String x: al) {
			
			System.out.println(x);
		}*/

	}
//lala hahah
}
