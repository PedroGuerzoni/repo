package mypackage1;

public class book {
	protected String title;
	protected String author;

	protected book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	protected void show() {
		
		System.out.println("Title is: " + title);
		System.out.println("Author is: " + author);

		
	}
}
