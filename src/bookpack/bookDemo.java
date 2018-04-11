package bookpack;
import mypackage1.book;

class bookDemo {

	public static void main(String[] args) {

		booktype1 b = new booktype1("Java beginner", "Anonymous");
		b.show1();
	}

}

class booktype1 extends book{

	public booktype1(String title, String author) {
		super(title, author);
	}
	
	 void show1() {
		
		super.show();
		
	}
	
	
}