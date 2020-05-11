package designpattern.behavioral.iterator;

public class BookIterator implements MyIterator<Book>{
	
	private Book[] books;
	private int position;
	
	public BookIterator(Book[] books) {
		this.books = books;
		this.position = 0;
	}

	@Override
	public void reset() {
		this.position = 0;
		
	}

	@Override
	public Book next() {
		if(this.position< books.length) {
		return books[this.position++];
		} 
		System.out.println("Books are Empty ");
		return null;
	}

	@Override
	public boolean hasNaxt() {
		
		return this.position< books.length;
	}

}
