import static java.lang.System.out;
public class AnnoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myClass obj = new myClass("Test");
		out.println(obj.getMsg());
	}

}

class myClass{
	
	private String msg;
	myClass(String m){
	msg = m;
	}
	
	@Deprecated
	String getMsg(){return msg;}
}