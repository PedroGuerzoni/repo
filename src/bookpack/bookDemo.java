package bookpack;
import mypackage1.book;
import mypackage1.*;

class bookDemo {

	public static void main(String[] args) {

		//mypackage1.book b1 = new mypackage1.book("Java beginner", "Anonymous");
		booktype1 b = new booktype1("Java beginner", "Anonymous");
		b.show1();
	}

}

class booktype1 extends book{

	public booktype1(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}
	
	 void show1() {
		
		super.show();
		
	}
	
	
}