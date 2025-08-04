package sec01.homework01;

public class Book {
	String title;
	String author;
	String category;
	int price;
	
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public Book() {
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}
	
	
}
