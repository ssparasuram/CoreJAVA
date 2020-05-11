package designpattern.behavioral.iterator;

public class Book {

	private String name;
	private String isbn;
	private String author;
	
	public Book(String name, String isbn, String author) {
		this.name = name;
		this.isbn = isbn;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", isbn=" + isbn + ", author=" + author + "]";
	}
	
}
