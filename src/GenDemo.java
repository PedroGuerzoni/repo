 import static java.lang.System.*;
public class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		Gen<Integer> iob;
		iob = new Gen<Integer>(88);
		iob.showType();
		out.println(iob.getob());
		
		Gen<Vehicle> iob2 = new Gen<Vehicle>(new Vehicle(3,3,3));
		iob2.showType();
		
		Gen<String> iob3 = new Gen<String>("Generics");
		out.println(iob3.getob());
		
		NumericGen<Integer,Double> a = new NumericGen<Integer,Double>(3,5.0);
		a.showSUM();*/

		NumericGen<Double> a = new NumericGen<Double>(5.0);
		NumericGen<Integer> b = new NumericGen<Integer>(-7);

		
		out.println(a.absEqual(b));
		
		Integer c[] = {1,2,3,4,5};
		Integer[] d = {1,2,3,4,5};

		out.println(comArray.arrayEqual(c, d));

	}

}

class comArray{
	
	static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] t,V[] v) {
		
		if(t.length != v.length)
		return false;
		else {
			for(int i = 0;i<t.length;i++) {
				if(!t[i].equals(v[i])) 
				return false;
			}
			return true;
			
		}
		
	}
	
}



class NumericGen<T extends Number>{
	T ob;
	
	
	NumericGen(T o){
		ob = o;
	}
	
	T getT() {
		return ob;
		
	}

	boolean absEqual(NumericGen<?> o){
		if(Math.abs(ob.doubleValue()) == Math.abs(o.ob.doubleValue())) return true;
		return false;
		
		
	}
	
}



/*class NumericGen<T extends Number,V extends Number>{
	T ob;
	V ob2;
	
	NumericGen(T o,V o2){
		ob = o;
		ob2 = o2;
	}
	
	T getT() {
		return ob;
		
	}
	V getV() {
		return ob2;
		
	}
	
	void showSUM(){
		out.println(ob.doubleValue() + ob2.doubleValue());
		
		
	}
	
}


class Gen<T>{
	T ob;
	
	Gen(T o){
		ob = o;
	}
	
	T getob() {
		return ob;
		
	}
	
	void showType(){
		out.println("Object is of type: " + ob.getClass().getName());
		
	}
	
}*/