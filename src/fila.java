public class fila{
	
	private char arr[];
	private int putloc;
	private int getloc;
	
	 fila(int size){
		 this.arr = new char[size];
		 this.putloc = 0;
		 this.getloc = 0;

	}
	 
	 fila(fila ob){
		 
		 this.arr = new char[ob.arr.length];
		 for(int i = 0; i<ob.arr.length;i++) this.arr[i] = ob.arr[i];
		 
		 this.putloc = ob.putloc;
		 this.getloc = ob.getloc;
		 
	 }
	
	 void put(char value) {
		 
		 if(putloc == this.arr.length) {
			 
			 
			 System.out.println("Fila esta cheia");
			 return;
			 
			 }
		 else {
		 this.arr[putloc++] = value;

		 }
	 }
	 
	 char get() {
		 if(putloc == getloc) {
			 
			 
			 System.out.println("Fila esta vazia");
			 return (char) 0;
			 
			 }
		 return this.arr[getloc++];
		 
	 }
	 
	 
	
}
